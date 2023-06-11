# Java Stream
# What is stream

### About Stream


Streams are a concept introduced in Java 8 that can handle data in collections, which can be understood as a high-level collection

As we all know, collection manipulation is very cumbersome, but streams can easily filter the collection and manipulate the collection in the form of a declaration.

We do not need to write code, we can write SQL language as we can operate on collection objects. Stream collection operations are transparent to us, we just give commands to the stream, and it will automatically give us the results we want. Since the operation process is handled entirely by Java, it can choose the best method to handle the current hardware environment, and we do not need to write complex and error-prone multi-threaded code

the stream is thread-safe, a sequential stream is executed in a single thread running on one CPU core, and a parallel stream is executed by different threads. running on multiple CPU cores in a computer.


###Characteristics of streams
1. We can think of a stream as a pipeline, the source of which is our data source (a collection), and the elements of the data source are transported sequentially to the pipeline, where we can perform various operations on the elements. Once the elements go to the other end of the pipeline, they are "consumed" and we can no longer operate on the stream. Of course, we can get a new stream from the data source and iterate through it again.


2.Using internal iteration To process a collection, we would have to write the processing code by hand, which is called external iteration. To process a stream, we just tell the stream what we want and the stream does the processing itself, which is called internal iteration.



### Types of stream operations

There are two types of stream operations, namely intermediate operations and terminal operations.

1. Intermediate operations
    Once the data in the data source is on the pipeline, all operations performed on the data by the process are called "intermediate operations".
    Intermediate operations still return a stream object, so multiple intermediate operations can be concatenated to form a pipeline.
2. Terminal operations
    When all intermediate operations are completed, to take the data off the pipeline, a terminal operation is executed.
    The terminal operation will return an execution result, which is the data you want.

### Streaming process

Using streams requires a total of three steps:

1. prepare a data source
2. perform intermediate operations
    There can be multiple intermediate operations, which can be concatenated to form a pipeline.
3. Execute the end operation
    After executing the terminal operation the stream ends and you get an execution result.


## Using streams

### Creating streams

Before you can use a stream, you first need to have a data source and get the stream object for that data source through some methods provided by StreamAPI. The data source can take many forms



Data folder, building Data
Project.java

Test4 folder
create stream via List
```java

List<String> list=Arrays.asList("hello","world");
Stream<String> stream=list.stream();

stream.forEach(n->System.out.println(n));
```

test5 folder
filter 
distinct
limit
skip
```java
List<Project> projects = Project.buildData();

List<Project> collect = projects.stream()
                .filter(project -> project.getStars() > 1000)
                .collect(Collectors.toList());

// distinct
Stream<Integer> numbers = Stream.of(1, 2, 3, 3, 2, 4);
numbers.distinct().limit(3).forEach(n -> System.out.println(n));

System.out.println("===================");
Stream.of(1, 2, 3, 3, 2, 4).skip(4).forEach(n -> System.out.println(n));

```
test6 folder
map
```java
 List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");

 words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList())
        .forEach(i -> System.out.println(i)); 

List<Project> projects = Project.buildData();
projects.stream().map(p->p.getName()).collect(Collectors.toList()).forEach(n->System.out.println(n));
```

flatMap
test7 folder
```java
List<String> list = Arrays.asList("I am a boy", "I love the girl", "But the girl loves another girl");

list.stream()
                .map(word -> word.split(" "))   // Stream<String>
                .flatMap(Stream::of)
                .distinct()
                .collect(Collectors.toList()).forEach(n->System.out.println(n));
```

Match element
test8 folder
allMatch
anyMatch
nonMatch
findFirst
findAny
```java
List<Project> projects = Project.buildData();

boolean hasBiezhi = projects.stream()
                .anyMatch(p -> p.getAuthor().equals("biezhi"));

System.out.println(hasBiezhi);

System.out.println(projects.stream()
                .allMatch(p -> p.getAuthor().equals("biezhi")));

System.out.println(projects.stream()
                .noneMatch(p -> p.getAuthor().equals("biezhi")));

System.out.println(projects.stream().findAny().get());
System.out.println(projects.stream().findFirst().get());
```


reduce
test9 folder
a varible as result
```java
     List<Project> projects = Project.buildData();
        List<Integer> numbers  = Arrays.asList(2, 4, 5, 6);

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        System.out.println(sum);

        Integer reduce = numbers.stream()
                .reduce(0, (a, b) -> {System.out.println("a==="+a); System.out.println("b==="+b); return a+b;});
        System.out.println(reduce);
```


data stream InputStream,DoubleStream, LongStream
test10 folder
a varible as result
```java

List<Project> projects=Project.buildData();

        OptionalInt max=projects.stream().mapToInt(p->p.getStars()).max();

        System.out.println(max.getAsInt());
```


implemet Fibonacci tuple sequence by steram iterate
test11 folder
```java
@AllArgsConstructor
    static class Tuple{
        int first;
        int second;
    }

    public static void main(String args[]){
        Stream.iterate(new Tuple(0,1),tuple->new Tuple(tuple.second,tuple.first+tuple.second)).limit(20).forEach(tuple->System.out.println("("+ tuple.first +","+ tuple.second +")"));
    }
```


output by stream
test12 folder
```java
List<Project> projects=Project.buildData();

projects.stream().map(Project::getName).limit(3).collect(Collectors.toList()).forEach(n->System.out.println(n));
```

filter and reduce
test14 folder
```java

        List<Project> projects = Project.buildData();
        Integer biezhi = projects.stream()
                .filter(p -> p.getAuthor().equals("biezhi"))
                .map(p -> p.getStars())
                .reduce(0, Integer::sum);
        System.out.println(biezhi);
```


## Intermediate and Collection Operations

| operation | type | return type | type/functional interface used | function descriptor |
|:-----:|:--------|:-------|:-------|:-------|
| `filter` | middle | `Stream<T>` | `Predicate<T>` | `T -> boolean` |
| `distinct` | middle | `Stream<T>` | | |
| `skip` | middle | `Stream<T>` | long | |
| `map` | middle | `Stream<R>` | `Function<T, R>` | `T -> R` |
| `flatMap` | middle | `Stream<R>` | `Function<T, Stream<R>>` | `T -> Stream<R>` |
| `limit` | middle | `Stream<T>` | long |
| `sorted` | middle | `Stream<T>` | `Comparator<T>` | `(T, T) -> int` |
| `anyMatch` | terminal | `boolean` | `Predicate<T>` | `T -> boolean` |
| `noneMatch` | terminal | `boolean` | `Predicate<T>` | `T -> boolean` |
| `allMatch` | terminal | `boolean` | `Predicate<T>` | `T -> boolean` |
| `findAny` | terminal | `Optional<T>` | | |
| `findFirst` | | terminal | `Optional<T>` | | |
| `forEach` | terminal | `void` | `Consumer<T>` | `T -> void` |
| `collect` | terminal | `R` | `Collector<T, A, R>` | |
| `reduce` | terminal | `Optional<T>` | `BinaryOperator<T>` | `(T, T) -> T` |
| `count` | | terminal | `long` | | |


Static factory methods of **Collectors class**

| Factory Methods | Return Type | Usage | Examples |
|:-----:|:--------|:-------|:-------|
| `toList` | `List<T>` | Collects all projects in the stream into a List | `List<Project> projects = projectStream.collect(toList());` |
| `toSet` | `Set<T>` | Collects all items in the stream into a Set, removing duplicates | `Set<Project> projects = projectStream.collect(toSet());` |
| `toCollection` | `Collection<T>` | Collects all items in the stream into a collection created by the given supply source | `Collection<Project> projects = projectStream.collect(toCollection(), ArrayList. :new);` |
| `counting` | `Long` | count the number of elements in the stream | `long howManyProjects = projectStream.collect(counting());` |
| `summingInt` | `Integer` | sums an integer property of the items in the stream | `int totalStars = projectStream.collect(summingInt(Project::getStars));` |
| `averagingInt` | `Double` | computes the average of the project Integer properties in the stream | `double avgStars = projectStream.collect(averagingInt(Project::getStars));` |
| `summarizingInt` | `IntSummaryStatistics` | collects statistics about the Integer properties of the project in the stream, such as maximum, minimum, sum and average | `IntSummaryStatistics projectStatistics = projectStream .collect(summarizingInt(Project::getStars));` |
| `joining` | `String` | string generated by joining calls to the toString method on each item in the stream | `String shortProject = projectStream.map(Project::getName).collect(joining(", "));` |
| `maxBy` | `Optional<T>` | Optional with the largest element selected by the given comparator, or Optional.empty() if the stream is empty | `Optional<Project> fattest = projectStream.collect(maxBy( comparingInt(Project::getStars)));` |
| `minBy` | `Optional<T>` | Optional with the smallest element selected by the given comparator, or Optional.empty() if the stream is empty | `Optional<Project> fattest = projectStream.collect(minBy( comparingInt(Project::getStars)));` |
| `reducing` | The type resulting from the normalization operation | Starting with an initial value as an accumulator, the stream is normalized to a single value by using the BinaryOperator to combine with the elements of the stream one by one | `int totalStars = projectStream.collect(reducing(0, Project ::getStars, Integer::sum));` |
| `collectingAndThen` | convert the type returned by the function | include another collector, apply the conversion function to its result | `int howManyProjects = projectStream.collect(collectingAndThen(toList(), List::size ));` |
| `groupingBy` | `Map<K, List<T>>` | interrogates the items in the stream based on the value of a property of the item and makes the property value the key of the resulting Map | `Map<String,List<Project>> projectByLanguage = projectStream. collect(groupingBy(Project::getLanguage));` |
| `partitioningBy` | `Map<Boolean,List<T>>` | Partition items based on the result of applying assertions to each item in the stream | `Map<Boolean,List<Project>> vegetarianDishes = projectStream. collect(partitioningBy(Project::isVegetarian));` |



The default number of threads used for concurrent streams is equal to the number of processor cores on your machine.

This value can be modified by this method, which is a global property.

```java
System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "12").
```


**Data sources and decomposability of streams**

| Source | Decomposability |
|:-----:|:-------|
| `ArrayList` | very good |
| `LinkedList` | poor |
| `IntStream.range` | very good |
| `Stream.iterate` | poor |
| `HashSet` | good |
| `TreeSet` | good |
