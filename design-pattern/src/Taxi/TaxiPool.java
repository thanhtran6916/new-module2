package Taxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class TaxiPool {
    private static final long THOI_GIAN_DOI_XE = 1200;
    private static final int SO_XE_TAXI = 4;
    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());
    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean waiting = new AtomicBoolean(false);

    public synchronized void traXe(Taxi taxi) {
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName() + " is free");
    }

    private void waiting(long time) {
        try {
            TimeUnit.MICROSECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private void doiXeTaxiTrong() {
        if (waiting.get()) {
            waiting.set(false);
            throw new RuntimeException();
        }
        waiting.set(true);
        waiting(THOI_GIAN_DOI_XE);
    }

    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("taxi" + count.incrementAndGet());
        System.out.println(taxi.getName() + " is created");
        return taxi;
    }

    public synchronized Taxi getTaxi() {
        if (!available.isEmpty()) {
            Taxi taxi = available.get(0);
            inUse.add(taxi);
            return taxi;
        }
        if (count.get() == SO_XE_TAXI) {
            this.doiXeTaxiTrong();
            return this.getTaxi();
        }
        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
    }
}
