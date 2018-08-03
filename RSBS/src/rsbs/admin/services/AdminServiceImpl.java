package admin.services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import admin.mapper.AdminMapper;
import admin.model.AdminModel;

public class AdminServiceImpl implements AdminServices {

	private AdminMapper adminMapper;

	public AdminMapper getAdminMapper() {
		return adminMapper;
	}

	public void setAdminMapper(AdminMapper adminMapper) {
		this.adminMapper = adminMapper;
	}
	@Override
	public List<AdminModel> getPartyInfo()
	{
		return getAdminMapper().getPartyInfo();
	}
	@Override
	public void addPoliticianInfo(AdminModel ad)
	{
		getAdminMapper().addPoliticianInfo(ad);
	}
	
	@Override
	public List<AdminModel> getLastAdded_celebrity()
	{
		return getAdminMapper().getLastAdded_celebrity();
	}
	@Override
	public void updateCelebrityProfile_photo(String profile_photo_name,String profile_photo_path,int celebrity_id)
	{
		getAdminMapper().updateCelebrityProfile_photo(profile_photo_name, profile_photo_path,celebrity_id);
	}
	@Override
	public List<AdminModel> getAllCelebrity_info(int limit, int offset)
	{
		return getAdminMapper().getAllCelebrity_info(limit, offset);
	}
	@Override
	public void ActivateCelebrity(int celebrity_id)
	{
			getAdminMapper().ActivateDeactivate_celebrity(1, celebrity_id);
	}
	
	@Override
	public void DeactivateCelebrity(int celebrity_id)
	{
			getAdminMapper().ActivateDeactivate_celebrity(0, celebrity_id);
	}
	@Override
	public List<AdminModel> getCelebrityInfo_byId(int celebrity_id)
	{
		return getAdminMapper().getCelebrityInfo_byId(celebrity_id);
	}
	
	@Override
	public void updateCelebrityInfo(AdminModel ad)
	{
		getAdminMapper().updateCelebrityInfo(ad);
	}

	@Override
	public List<AdminModel> getBlacklist_WebsiteByName(String website_name) {
		
		return getAdminMapper().getBlacklist_WebsiteByName(website_name);
	}

	@Override
	public int updateWebsite_name(String website_name, int web_id) {
		
		return getAdminMapper().updateWebsite_name(website_name, web_id);
	}

	@Override
	public int deleteWebsite_FromBlackList(int web_id) {
		
		return getAdminMapper().deleteWebsite_FromBlackList(web_id);
	}

	@Override
	public List<AdminModel> getBlacklist_Website() {
	
		return getAdminMapper().getBlacklist_Website();
	}

	@Override
	public int InsertBlcakList_Website(String website_name) {
		
		return getAdminMapper().InsertBlcakList_Website(website_name);
	}

	@Override
	public List<AdminModel> getExistingPartyName(String party_name) {
		
		return getAdminMapper().getExistingPartyName(party_name);
	}

	@Override
	public int addNewParty(String party_name) {

		return getAdminMapper().addNewParty(party_name);
	}

	@Override
	public List<AdminModel> getAllParties() {
		
		return getAdminMapper().getAllParties();
	}

	@Override
	public int updatePartyName(int party_id, String party_name) {
		
		return getAdminMapper().updatePartyName(party_id, party_name);
	}

	@Override
	public int deleteParty(int party_id) {

		return getAdminMapper().deleteParty(party_id);
	}

	@Override
	public int deleteCelebrityNewsComments(int celebrity_id) {
		
		return getAdminMapper().deleteCelebrityNewsComments(celebrity_id);
	}

	@Override
	public int deleteCelebrityNewsLikes(int celebrity_id) {

		return getAdminMapper().deleteCelebrityNewsLikes(celebrity_id);
	}

	@Override
	public int deleteCelebrityPostsComments(int celebrity_id) {

		return getAdminMapper().deleteCelebrityPostsComments(celebrity_id);
	}

	@Override
	public int deleteCelebrityPostsLikes(int celebrity_id) {

		return getAdminMapper().deleteCelebrityPostsLikes(celebrity_id);
	}

	@Override
	public int deleteCelebrityFollowers(int celebrity_id) {

		return getAdminMapper().deleteCelebrityFollowers(celebrity_id);
	}

	@Override
	public int deletePoliticianInfo(int celebrity_id) {

		return getAdminMapper().deletePoliticianInfo(celebrity_id);
	}

	@Override
	public List<AdminModel> getAllSearchKeys() {
		
		return getAdminMapper().getAllSearchKeys();
	}

	@Override
	public int deleteSearchKey(int search_key_id) {
		
		return getAdminMapper().deleteSearchKey(search_key_id);
	}

	@Override
	public int updateSearchKey(int search_key_id, String search_key) {

		return getAdminMapper().updateSearchKey(search_key_id, search_key);
	}

	@Override
	public List<AdminModel> getAllStates() {
		
		return getAdminMapper().getAllStates();
	}

	@Override
	public List<AdminModel> getAllCelebrityCategories() {
	
		return getAdminMapper().getAllCelebrityCategories();
	}

	@Override
	public int addCelebrityCategory(int calebrity_id, int category_id) {
		
		return getAdminMapper().addCelebrityCategory(calebrity_id, category_id);
	}

	@Override
	public List<AdminModel> getCelebrityCategory(int celebrity_id) {
		
		return getAdminMapper().getCelebrityCategory(celebrity_id);
	}

	@Override
	public int deleteCelebrityCategory(int celebrity_id) {
	
		return getAdminMapper().deleteCelebrityCategory(celebrity_id);
	}
	@Override
	public List<AdminModel> getCelebrity_MappedCAtegories()
	{
		return getAdminMapper().getCelebrity_MappedCAtegories();
	}

	@Override
	public void addBlogs(AdminModel ad) {
	      
		getAdminMapper().addBlogs(ad);
		
	}

	@Override
	public List<AdminModel> getLastBlog() {
		
		return getAdminMapper().getLastBlog();
	}

	@Override
	public int updateBlogImage(String image_path, int blog_id) {
		
		return getAdminMapper().updateBlogImage(image_path, blog_id);
	}

	@Override
	public List<AdminModel> getBlogs() {
		
		return getAdminMapper().getBlogs();
	}

	@Override
	public int deleteBlogs(int blog_id) {
		
		return getAdminMapper().deleteBlogs(blog_id);
	}

	@Override
	public int updateBlogs(int blog_id, String blog_title, String description) {

		return getAdminMapper().updateBlogs(blog_id, blog_title, description);
	}

	@Override
	public List<AdminModel> getBlogsById(int blog_id) {

		return getAdminMapper().getBlogsById(blog_id);
	}

	@Override
	public int getCelebrityCount() {
		
		return getAdminMapper().getCelebrityCount();
	}

	@Override
	public List<AdminModel> getSearchCelebrity_info(String celebrity_name) {
	
		return getAdminMapper().getSearchCelebrity_info(celebrity_name);
	}

	@Override
	public int deleteCelebrityTwitterAccounts(int celebrity_id) {
		
		return getAdminMapper().deleteCelebrityTwitterAccounts(celebrity_id);
	}

	@Override
	public int addCelebrityTwitterAcnt(int celebrity_id, String twitterName) {
		return getAdminMapper().addCelebrityTwitterAcnt(celebrity_id, twitterName);
	}

	@Override
	public List<AdminModel> getCelebrityTwitterAccount(int celebrity_id) {
		return getAdminMapper().getCelebrityTwitterAccount(celebrity_id);
	}

	@Override
	public List<AdminModel> gettwitter_account(int id,String twitname) {
		return getAdminMapper().gettwitter_account(id,twitname);
	}

	@Override
	public List<AdminModel> getUserAccounts(int limit,int offset) {
		return getAdminMapper().getUserAccounts(limit,offset);
	}

	@Override
	public List<AdminModel> getUserAccountsCount() {
		return getAdminMapper().getUserAccountsCount();
	}
	
}
