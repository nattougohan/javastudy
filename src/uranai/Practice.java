package uranai;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice
 */
@WebServlet("/Practice")
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Practice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = "たわし";
		int age = 35;


		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒");
		LocalDateTime now = LocalDateTime.now();
		String today = dtf.format(now);

		// HTMLを取得
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>俺の名は</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("私の名前は" + name + "、" + age + "才です。今日は" + today + "です。");
		pw.println("</body>");
		pw.println("</html>");




	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
