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



//Data folder, building Data
Project.java

//Test4 folder
//create stream via List
```java

List<String> list=Arrays.asList("hello","world");
Stream<String> stream=list.stream();

stream.forEach(n->System.out.println(n));
```

//under stream test5 folder
//filter 
//distinct
//limit
//skip
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

//merge 