package bean;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FruitPrice")
public class FruitPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FruitPrice() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// アプリケーションスコープ編（リファクタリング）
		// 「700円のいちご」のFruitインスタンスの生成
		Fruit fruit = new Fruit("いちご", 700);

		// セッションスコープの取得
		ServletContext application = this.getServletContext();

		// セッションスコープにインスタンスを保存
		application.setAttribute("fruit", fruit);

		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
		dispatcher.forward(request, response);

		// セッションスコープ編（リファクタリング）
//		// 「700円のいちご」のFruitインスタンスの生成
//		Fruit fruit = new Fruit("いちご", 700);
//
//		// セッションスコープの取得
//		HttpSession session = request.getSession();
//
//		// セッションスコープにインスタンスを保存
//		session.setAttribute("fruit", fruit);
//
//		// フォワード
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
//		dispatcher.forward(request, response);

		// リクエストスコープ編
//		// 「700円のいちご」のFruitインスタンスの生成
//		Fruit fruit = new Fruit("いちご", 700);
//
//		// スコープに保存
//		request.setAttribute("fruit", fruit);
//
//
//		// フォワード
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/show.jsp");
//		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
