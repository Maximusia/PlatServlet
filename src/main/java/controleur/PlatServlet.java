package controleur;

import modele.Plat;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class PlatServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{

            HttpSession session = req.getSession(false); // false = ne pas creer de nouvelle session

            // Verifie si l'utilisateur est connecte
            if(session == null || session.getAttribute("clientNom") == null) {
                res.sendRedirect("login.jsp");
                return;
            }

            String clientNom = (String) session.getAttribute("clientNom");
            
            List<Plat> plats = new ArrayList();

            // Creation des listes de plats
            plats.add(new Plat("Vary", "http://localhost/L2/S3/progsys/assets-cnd/vary.jpeg", 1000.00));
            plats.add(new Plat("Ravitoto", "http://localhost/L2/S3/progsys/assets-cnd/ravitoto.jpeg", 2000.00));
            plats.add(new Plat("Lasary", "http://localhost/L2/S3/progsys/assets-cnd/lasary.jpeg", 2000.00));

            // Stockage dans le context 
            // ServletContext context = this.getServletContext();
            // context.setAttribute("plats", plats);

            // Reponse HTTP
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            for (Plat p : plats) {
                out.println("Plat :" + p.getNom());
                out.println(p.getImage());
                out.println(p.getPrix());
            }

            // Envoi a la JSP
            req.setAttribute("clientNom", clientNom);
            req.setAttribute("plats", plats);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/listePlats.jsp");
            dispatcher.forward(req, res);
        }
}