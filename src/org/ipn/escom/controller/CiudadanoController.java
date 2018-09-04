package org.ipn.escom.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ipn.escom.model.Ciudadano;

/**
 * Servlet implementation class CiudadanoController
 */
@WebServlet("/ciudadano")
public class CiudadanoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static List<Ciudadano> ciudadanos = new ArrayList<Ciudadano>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CiudadanoController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(ciudadanos.toString()).append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		int edad = Integer.parseInt(request.getParameter("edad"));

		Ciudadano nuevoCiudadano = new Ciudadano();
		nuevoCiudadano.setId(ciudadanos.size() + 1);
		nuevoCiudadano.setNombre(nombre);
		nuevoCiudadano.setApellidos(apellidos);
		nuevoCiudadano.setEdad(edad);

		System.out.println("Nuevo Ciudadano::");
		System.out.println(nuevoCiudadano);

		ciudadanos.add(nuevoCiudadano);

	}

}
