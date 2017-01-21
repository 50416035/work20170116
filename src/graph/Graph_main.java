//ボタンを押してから画面の大きさを変化させなければグラフが描画されない。
package graph;

public class Graph_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph_view graph =new Graph_view();
		graph.setBounds(5,5,800,700);
		graph.setVisible(true);
	}

}
