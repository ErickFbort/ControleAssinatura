package UserControl;

public static updateSignature(Connection conn, int userId, String signature) throws SQLException {
    String query = "UPDATE signatures SET signature = ? WHERE user_id = ?";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setString(1, signature);
    pstmt.setInt(2, userId);
    pstmt.executeUpdate();
    pstmt.close();
}
