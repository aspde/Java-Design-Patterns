package cn.fangbin.behavioral.observer.generic;

/**
 * 观察者
 * @param <S> 泛型观察者
 * @param <O> 观察者
 * @param <A> 行动
 */
public interface Observer <S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    void update(S subject, A argument);
}
