// AST를 구성하고, Postfix 형태로 출력하며, AST를 계산하기
// 이진 트리 형태의 한 노드의 구성
class Tree {
char op; // 연산자를 표현함
Tree leftTree; // 왼쪽 서브트리의 포인터
Tree rightTree; // 오른쪽 서브트리의 포인터
// AST 구성
Tree(char c) { this(c, null, null); }
Tree(char c, Tree left, Tree right) {
op = c;
leftTree = left;
rightTree = right;
}
// Postfix 형태의 스트링으로 변환
public String toString () {
String str;
if (this == null) return "Null";
str = 
((leftTree == null) ? "" : leftTree.toString())
+ ((rightTree == null) ? "" : rightTree.toString())
+" " + op + " ";
return str;
}
// Tree 노드는 '+', '*', 한자리수 형태의 문자로 표현됨
// 재귀함수로 이용하고, +, *, 수 각각의 문자를 Java의 더하기, 곱하기, 정수로 해석함
int eval(Tree t) {
if (t.op == '+') return eval(t.leftTree) + eval(t.rightTree);
if (t.op == '*') return eval(t.leftTree) * eval(t.rightTree);
return Character.getNumericValue(t.op);
}
}
public class EvalTree {
public static void main (String argv[]) {
// (1 * 3) + (2 * 6) 에 대한 AST를 구성함
Tree tree = new Tree('+',
new Tree('*', new Tree('/', new Tree('A'), new Tree('B')), new Tree('D', new Tree('C'), new Tree('*'))),
new Tree('E')
);

// 구성된 AST인 tree를 toString을 적용하여 스트링으로 출력함
System.out.println(tree);
// tree를 연산하여 정수 값을 얻음
int val = tree.eval(tree);
System.out.println("The result of evaluation: " + val);
}
}
