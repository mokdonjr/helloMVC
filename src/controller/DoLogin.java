package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/doLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String customerID = request.getParameter("customerID");
		
		//Perform business logic. Return a bean as a result.
		//커스터머 정보를 담고 있는 bean.
		CustomerService service = new CustomerService();//서비스객체생성
		Customer customer = service.findCustomer(customerID);
		request.setAttribute("customer", customer);
		
		//We can iterate over lists using forEach in JSTL
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("id006", "kim", "kim@hansung.ac.kr"));
		customers.add(new Customer("id007", "Lee", "lee@hansung.ac.kr"));
		customers.add(new Customer("id008", "Park", "park@hansung.ac.kr"));
		request.setAttribute("customerList", customers);
		
		String page;
		if(customer == null)
			page = "/view/error.jsp";
		else 
			page = "/view/success.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);//포워딩
	}

}
