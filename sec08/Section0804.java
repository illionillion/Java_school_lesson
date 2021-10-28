package sec08;
/**
 * Section0804
 */
public class Section0804 {

    public static void main(String[] args) {
        // 文字列型heroを宣言し、勇者を代入する
        String hero="勇者";
        // 整数型attackを宣言し、5を代入する
        int attack=5;
        // 文字列型のenemyを宣言し、スライムを代入する
        String enemy="スライム";
        // 整数型のenemyHpを宣言し、10を代入
        int enemuyHp=10;
        // 「勇者がスライムを攻撃した！」と表示(heroとenemyを使用)
        System.out.println(hero+"が"+enemy+"を攻撃した！");
        // enemyHpからattackを引いて、enemyHpに代入
        enemuyHp-=attack;
        // 「スライムの残りHPは5」と表示(nenemyHpを使用)
        System.out.println(enemy+"の残りHPは"+enemuyHp);
        // enemyHpが0以下なら、「スライムを倒した！」と表示
        if (enemuyHp<=0) {
            System.out.println("スライムを倒した！");            
        }
        // enemyHpからattackを引いて、enemyHpに代入
        enemuyHp-=attack;
        // 「スライムの残りHPは0」と表示(nenemyHpを使用)
        System.out.println(enemy+"の残りHPは"+enemuyHp);        
        // enemyHpが0以下なら、「スライムを倒した！」と表示
        if (enemuyHp<=0) {
            System.out.println("スライムを倒した！");            
        }
    }
}