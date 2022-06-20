# Java Class - Training Course

## Concurrency Demo

#### Author: Herman Rabinkin

This repository contains examples which can help to
explain and understand basic Java Concurrency and work
with threads concept

_Actions marked with [ERROR] should be demonstrated and explained why this way is incorrect_

### General Demo
[_package: intro_](/src/com/hrm/threads/intro/IntroDemo.java)

* Create Threads via Thread inheritance
* Start Thread with run() [ERROR]
* Start Thread with start()
* Create Thread via Runnable
* Start runnable
* Create Thread via Runnable with Lambda syntax

### Data Race Demo
[_package: datarace_](/src/com/hrm/threads/datarace/DataRaceDemo.java)

* Explain wallet structure
* Start wallet modification with two threads [ERROR]
* Show no balance change
* Add sleep()
* Add debug print about thread's finish
* Add debug print during cycle
* Display what DEAMON means
* Replace sleep with join()
* Explain concept of data race
* Introduce synchronized key word in method
* Make synchronized block

### Thread States Demo
[_package: state_](/src/com/hrm/threads/state/StateDemo.java)

* Explain new wallet structure
* Add debug print for wail - awake
* Demo with withdraw only
* Demo both withdraw and top up

### Thread Block Demo
[_package: block_](/src/com/hrm/threads/block/BlockDemo.java)

* Introduce Locks
* Show blocking situation with locks
* Fix with reducing critical section [ERROR]
* Fix with synchronized

### Locks Demo
[_package: locks_](/src/com/hrm/threads/locks/LocksDemo.java)

* Introduce read and write operations
* Display that no need for locks while reading
* Writer data race demo
* Explain reader writer concept
* Display synchronization problem
* Explain locks advantage
* Demo with general lock [ERROR]
* Demo with ReadWrite lock

### Java Thread-Safe Objects
[_package: stringbuffer_](/src/com/hrm/threads/stringbuffer/SBThreadsDemo.java)

* Introduce concept of thread-safe stateful objects
* Demo concurrent work with StringBuilder [ERROR]
* Demo concurrent work with StringBuffer
* Demo performance loss comparing Builder and Buffer

### Race Condition Demo
[_package: racecondition_](/src/com/hrm/threads/racecondition/RaceConditionDemo.java)

* Explain demo code use case
* Demo race condition error
* Introduce barriers
* Demo working code


### Callable and Executors
[_package: callable_](/src/com/hrm/threads/callable/CallableDemo.java)

* Explain case when return value is needed
* Introduce callable
* Introduce Executors
* Demo callable and Future
* Demo ways to get value from Future shell
