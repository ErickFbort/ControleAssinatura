package UserControl;

public static addSignature(Connection conn, int userId, String signature) throws SQLException {
	String query = "INSERT INTO signatures (user_id, signature) VALUES (?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(query);
    pstmt.setInt(1, userId);
    pstmt.setString(2, signature);
    pstmt.executeUpdate();
    pstmt.close();
}
