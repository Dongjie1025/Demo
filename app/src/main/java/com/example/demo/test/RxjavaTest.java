package com.example.demo.test;

import com.example.demo.utils.MLog;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Consumer;

public class RxjavaTest {
    public static void rxjavaTest() {
        MLog.w("this thread name :",Thread.currentThread().getName());
        final Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Throwable {
                emitter.onNext(1);
                MLog.d("rxJava","1");
                emitter.onNext(2);
                MLog.d("rxJava","2");
                emitter.onNext(3);
                MLog.d("rxJava","3");
                emitter.onNext(4);
                MLog.d("rxJava","4");
                emitter.onComplete();
                MLog.d("rxJava","complete");
            }
        });
        final Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Throwable {
                MLog.e("rxJava",integer + "");
            }
        };
        observable.subscribe(consumer);
    }
}
