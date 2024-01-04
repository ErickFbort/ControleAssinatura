package UserControl;

public static deleteSignature(Connection conn, int userId) throws SQLException {
    String query = "DELETE FROM signatures WHERE user_id = ?";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setInt(1, userId);
    pstmt.executeUpdate();
    pstmt.close();
}