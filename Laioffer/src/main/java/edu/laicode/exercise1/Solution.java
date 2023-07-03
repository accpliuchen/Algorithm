package edu.laicode.exercise1;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * In this exercise
 * - A game activity (GameActivity) is uniquely identified by an ID (GameActivity.Id)
 * - A game activity can have dependencies on other game activities (GameActivity#dependencies)
 * - GameActivity must not have circular dependencies
 *
 * Exercise 1:
 *    Given a set of game activity IDs and their dependencies (defined by IDs), we want to create a valid order to play game activities.
 *    What strategy can we use to sort the game activities?
 *
 * Exercise 2
 *    Implement the method buildGameActivities(Set<GameActivity.Id> activityIds, Set<ActivityDependency> dependencies)
 *    This method should return a list of game activity IDs, sorted by the play order.
 *
 * Exercise 3:
 *    If we are to prevent circular dependencies, which class should we modify, and why?
 */
public class Solution {
    public static void main(String[] args) {
        GameActivityUtility utility = new GameActivityUtility();
        // Given
        Set<GameActivity.Id> activityIds = GameActivity.Id.of("a", "b", "c", "d");
        Set<ActivityDependency> activityDependencies = Set.of(
                new ActivityDependency("b", "a"), // b depends on a (can play b only after completing a)
                new ActivityDependency("b", "c"),
                new ActivityDependency("d", "b")
        );

        // When
        List<GameActivity.Id> sortedActivityId = utility.sortByPlayOrder(activityIds, activityDependencies);

        // Then
        // Correct orders are: ("a", "c", "b", "d") or ("c", "a", "b", "d")
        System.out.println(sortedActivityId);
    }
}

// Must complete all activities in `dependencies` before playing activity `id`
record GameActivity(GameActivity.Id id,
                    Set<GameActivity> dependencies) {

    record Id(String uid) {

        public static Set<GameActivity.Id> of(String... ids) {
            return Stream.of(ids)
                    .filter(Objects::nonNull)
                    .map(GameActivity.Id::new)
                    .collect(Collectors.toUnmodifiableSet());
        }
    }

}

// Before playing activity `id`, must complete activity `dependencyId`
record ActivityDependency(GameActivity.Id id,
                          GameActivity.Id dependencyId) {
    public ActivityDependency(String id, String dependencyId) {
        this(new GameActivity.Id(id), new GameActivity.Id(dependencyId));
    }
}

class GameActivityUtility {
    public List<GameActivity.Id> sortByPlayOrder(Set<GameActivity.Id> activityIds, Set<ActivityDependency> activityDependencies) {
        // activityIds = ("a", "b", "c", "d")
        // key  value
        //("b", "a"), ("b", "c"), ("d", "b")
        // activityDependencies = (("b", "a"), ("b", "c"), ("d", "b"))  ##  "a" and "c" have no dependencies
        // result = ("a", "c", "b", "d") or ("c", "a", "b", "d")
        // TODO Exercise 2

        //Set<>=activityIds.get()
        //if(set==nul)
        //put activityIds,set=new HashSet<ActivityDependency>
        //set.add();



        List<GameActivity.Id> list=new ArrayList<GameActivity.Id>();
        HashMap<GameActivity.Id,Set<GameActivity.Id>> map=new HashMap<GameActivity.Id,Set<GameActivity.Id>>();


        for(GameActivity.Id  val:activityIds){

        }


        return Collections.emptyList();

        // One possible approach to first build a graph of game activities and then apply the sorting.
        // Set<GameActivity> activities = buildGameActivities(activityIds, activityDependencies);
        // return sortByPlayOrder(activities);
    }

    public Set<GameActivity> buildGameActivities(Set<GameActivity.Id> activityIds, Set<ActivityDependency> dependencies) {
        // activityIds = ("a", "b", "c", "d")
        // activityDependencies = (("b", "a"), ("b", "c"), ("d", "b"))  ##  "a" and "c" have no dependencies
        // result = (
        //     <"a",()>,
        //     <"b",(<"a",()>,<"c",()>,
        //     <"c",()>
        //     <"d",(<"b",(<"a",()>,<"c",()>)> )
        return Collections.emptySet();
    }

    public List<GameActivity.Id> sortByPlayOrder(Set<GameActivity> activities) {
        return Collections.emptyList();
    }

    private Set<GameActivity> removeActivity(Set<GameActivity> activities, GameActivity.Id idToRemove) {
        return activities.stream()
                .filter(a -> !a.id().equals(idToRemove))
                .map(a -> new GameActivity(a.id(), removeActivity(a.dependencies(), idToRemove)))
                .collect(Collectors.toUnmodifiableSet());
    }
}

