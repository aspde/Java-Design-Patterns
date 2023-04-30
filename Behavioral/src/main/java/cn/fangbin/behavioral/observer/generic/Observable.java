package cn.fangbin.behavioral.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 由java泛型和集合启发的泛型观察者
 * @param <S> 主题
 * @param <O> 观察者
 * @param <A> 参数类型
 */
public abstract class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {

    protected final List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    @SuppressWarnings("unchecked")
    public void notifyObservers(A argument) {
        for (O observer : observers) {
            observer.update((S) this, argument);
        }
    }
}
