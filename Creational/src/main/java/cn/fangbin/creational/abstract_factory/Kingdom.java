package cn.fangbin.creational.abstract_factory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kingdom {

    private King king;
    private Castle castle;
    private Army army;

    /**
     * 王国工厂的工厂
     */
    public static class FactoryMaker {

        /**
         * 不同类型王国的枚举
         */
        public enum KingdomType {
            ELF, ORC
        }

        /**
         * 创建KingdomFactory具体对象的工厂方法
         */
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("王国类型不支持");
            }
        }
    }
}
