
/*******************************************************************************
 * Copyright (c) 2016 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package main.java.wasdev.sample.morsecode.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MorseCodeServlet")
public class MorseCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public MorseCodeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		main.java.wasdev.sample.morse.MorseCodeOutputter mco = new main.java.wasdev.sample.morse.MorseCodeOutputter();
		

		response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("MorsecodeText");
		out.println("Message Received, " + name);
		for(int i=0; i<name.length(); i++){
			char character = name.charAt(i);
			mco.character(character);
			
			
		}
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}