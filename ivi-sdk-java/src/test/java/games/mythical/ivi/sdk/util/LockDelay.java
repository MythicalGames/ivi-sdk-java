package games.mythical.ivi.sdk.util;

import org.grpcmock.definitions.response.Delay;

import java.util.concurrent.locks.ReentrantLock;

public class LockDelay implements Delay {
    private final ReentrantLock lock;

    public LockDelay(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public long inMilliseconds() {
        return 0;
    }

    @Override
    public void delayAction() {
        try {
            while (lock.isLocked()) {
                Thread.sleep(1);
            }
            System.out.println("unlocked");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
