package main; // Asegúrate de que este paquete sea igual al de tu MenuPrincipal

public class main {
    public static void main(String[] args) {
        // Establecer el tema "Nimbus" si está disponible (visual bonito)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo establecer el estilo visual Nimbus.");
        }

        // Abrir el menú principal
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true); // O usa Despues_Menu si así lo nombraste
        });
    }public class Main {
    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}

}
