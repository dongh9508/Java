// AST�� �����ϰ�, Postfix ���·� ����ϸ�, AST�� ����ϱ�
// ���� Ʈ�� ������ �� ����� ����
class Tree {
char op; // �����ڸ� ǥ����
Tree leftTree; // ���� ����Ʈ���� ������
Tree rightTree; // ������ ����Ʈ���� ������
// AST ����
Tree(char c) { this(c, null, null); }
Tree(char c, Tree left, Tree right) {
op = c;
leftTree = left;
rightTree = right;
}
// Postfix ������ ��Ʈ������ ��ȯ
public String toString () {
String str;
if (this == null) return "Null";
str = 
((leftTree == null) ? "" : leftTree.toString())
+ ((rightTree == null) ? "" : rightTree.toString())
+" " + op + " ";
return str;
}
// Tree ���� '+', '*', ���ڸ��� ������ ���ڷ� ǥ����
// ����Լ��� �̿��ϰ�, +, *, �� ������ ���ڸ� Java�� ���ϱ�, ���ϱ�, ������ �ؼ���
int eval(Tree t) {
if (t.op == '+') return eval(t.leftTree) + eval(t.rightTree);
if (t.op == '*') return eval(t.leftTree) * eval(t.rightTree);
return Character.getNumericValue(t.op);
}
}
public class EvalTree {
public static void main (String argv[]) {
// (1 * 3) + (2 * 6) �� ���� AST�� ������
Tree tree = new Tree('+',
new Tree('*', new Tree('/', new Tree('A'), new Tree('B')), new Tree('D', new Tree('C'), new Tree('*'))),
new Tree('E')
);

// ������ AST�� tree�� toString�� �����Ͽ� ��Ʈ������ �����
System.out.println(tree);
// tree�� �����Ͽ� ���� ���� ����
int val = tree.eval(tree);
System.out.println("The result of evaluation: " + val);
}
}
