# Assignment_09

Thread class provides several methods for managing and controlling threads. Here are some of the most commonly used thread methods:

start(): Starts the execution of the thread. The run() method of the thread will be invoked by the JVM.

run(): This method contains the code that constitutes the thread's task or behavior. It needs to be overridden in a subclass of Thread.

sleep(long millis): Causes the currently executing thread to sleep for the specified number of milliseconds.

join(): Waits for this thread to die. It blocks the current thread until the thread on which it's called has finished its execution.

isAlive(): Returns true if the thread is still alive, i.e., has been started and not yet terminated.

setName(String name): Changes the name of the thread to the specified name.

getName(): Returns the name of the thread.

interrupt(): Interrupts this thread, causing it to stop what it is doing and start executing the exception handling code.

isInterrupted(): Tests whether this thread has been interrupted. It does not clear the interrupt status flag.

currentThread(): Returns a reference to the currently executing thread object.
