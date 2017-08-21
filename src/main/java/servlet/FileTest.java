package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileTest
 */
@WebServlet("/FileTest")
public class FileTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FileOutputStream fs = new FileOutputStream("H:/opengion_user/tmp/fotest.txt");

		final InputStream is = request.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);

		int contents;
		while((contents = isr.read()) != -1){
			fs.write(contents);
		}

		fs.close();
		isr.close();
		is.close();


		RequestDispatcher dispatch = request.getRequestDispatcher("./test.jsp");

		//request.setCharacterEncoding("UTF-8");
		// 遷移後の文字化け対策
		response.setContentType("text/html;charset=UTF-8");
		System.out.println(response.getContentType());
		dispatch.forward(request, response);
	}

}
