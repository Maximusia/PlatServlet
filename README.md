# PlatServlet2
Mini-projet Java Servlet/JSP : affichage d'une liste de plats avec authentification client simple.
---
# Structure du projet
    #PlatServlet2
# build (creer automatiquement)
    # WEB-INF
        # classes
            # modele
                # Plat.class
            # controleur 
                # PlatServlet.class
    # listePlats.jsp
    # PlatServlet2.war
# lib
    # servlet-api.jar (le compilateur sevlet)
# src (source du projet)
    # main
        # java
            # modele 
                # Plat.java
            # controleur
                # PlatServlet.java
        # webapp
            # WEB-INF
                # web.xml
            # listePlats.jsp

README.md

## Fonctionnalites

1. ** login **
    - page 'login.jsp' : l'utilisateur saisit son nom.
    - redirection vers 'PlatServlet' qui stocke le nom dans  'request' et affiche les plats.

2. **Servlet 'PlatServlet' **
    - genere une liste de plats ('Plat') avec nom, image et prix.
    - transmet cette liste et le nomdu client a 'listePlats.jsp'.

3. ** JSP 'listPlats.jsp' **
    - affiche le nom du client
    - affiche la liste des plats avec image et prix.

---

# Deployement
 compiler le projet :
'''bash
./deploy.sh