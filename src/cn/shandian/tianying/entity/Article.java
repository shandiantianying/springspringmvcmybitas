package cn.shandian.tianying.entity;



public class Article {
	 private int id;
	    private User user;
	    private String title;
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		private String content;
}
