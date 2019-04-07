# Mars Rover Functional Programming

I have solved the problem defined [HERE](https://github.com/arvindkgs/Mars-Rover-Traditional/blob/master/README.md) using functional programming.

You can see how concise this code looks compared to the OOP approach used to solve the same problem [here](https://github.com/arvindkgs/Mars-Rover-Traditional)

I have used [fold](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/fold.html) to reduce the the sequence of instructions to a single final position, which is the destination expected.

***Fold*** takes an accumulator and element of list/map, combines/reduces and returns this value as accumulator to next element and so on, till the last element is completed.

***Fold*** is similar to **_Reduce_** except that it takes and initial value, whereas **_Reduce_** copies the first element to the accumulator. Also **_Fold_** can be used when the accumulator is of a different type than the list or map.

The crux of the problem is converting the sequence of instructions given as a string to a position on the grid.

So, given instructions 'MML' tells the rover to move two spaces in which ever direction it is facing and the turn left.

- Split the string(ins) into a Character Sequence.
- Pass the initial position of Rover to Fold
- For each char instruction('L', 'R' or 'M'), turn left, right or move the rover respectively.

_Below is the code that performs the above steps_

```
ins.fold(position) { acc: RoverPosition, ins ->
            when (ins) {
                'L' -> acc.left()
                'R' -> acc.right()
                else -> acc.move(pl)
            }
        }
```