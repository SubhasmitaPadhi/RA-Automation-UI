/**
 * 
 */
package Testcases;

import org.openqa.selenium.By;

/**
 * @author padhisub
 *RA_locators will be store here
 */
public class RA_LOCATORS {
	
  public static final  String userid = "/html/body/div/section/div/div/div[1]/form/p[1]/input"; 
  public static final  String password ="//*[@id=\"j_password\"]";
  public static final String login_button = "//*[@id=\"loginForm\"]/p[3]/a/input" ;

  //switch tenant
	public static final  String tenanticon ="//*[@id=\"nav_id\"]/div/ul/li[2]/a";
	public static final String hubzutenant ="//*[@id=\"nav_id\"]/div/ul/li[2]/ul/li/ul/li[4]/a";
	public static final String confirmtenant ="//*[@id=\"confirmModal\"]/div/div/div[3]/button[1]";
	public static final String waituntillseeapplybutton ="(//button[@class='btn btn-primary btn-block btn-sm apply-btn'])[1]";

	//  locators for modelet profiling
  public static final String modelet_profiling_tab ="Modelet Profiling";
  public static final String manage_profile_tab = "//*[@id=\"hm_lp_manageProfile\"]";

  // add profile
  public static final String addprofilebutton = "//*[@id=\"sp_gridbody\"]/button";
  public static final String profilename="//*[@id=\"modeletName\"]";
  public static final String Description = "//*[@id=\"description\"]";
  public static final String LD_LIBRARY_PATH="//*[@id=\"ldlib\"]";
  public static final String JAVA_HOME  = "//*[@id=\"javahome\"]";
  public static final String Workspace="//*[@id=\"workspace\"]";
  public static final String Hazelcast_Config = "//*[@id=\"hazelcastConfig\"]";
  public static final String R_Home="//*[@id=\"rhome\"]";
  public static final String Http_Connection_Pool_Properties ="//*[@id=\"newModal\"]/div/div/form/div[1]/div[9]/div[2]/input";
  public static final String R_Home_edit_page="//*[@id=\"rhome2\"]";
  
 // public static final String save_profile ="//*[@id=\"update_mp2\"]";
  public static final String cancel_profile ="//*[@id=\"newModal\"]/div/div/form/div[2]/div/div[2]/button[2]";
  public static final String Execution_Platform  ="//*[@id=\"newModal\"]/div/div/form/div[1]/div[10]/div/select";
  public static final String Execution_Environment ="//*[@id=\"newModal\"]/div/div/form/div[1]/div[8]/div[2]/select";
  public static final String Execution_Environment_edit_page="//*[@id=\"myModal\"]/div/div/form/div[1]/div[8]/div[2]/select";
  public static final String loglevel="//*[@id=\"loglevel\"]";
  public static final String edit_icon="(//*[contains(@class,'fa fa-edit')])[1]";
  public static final String update = "(//button[@class='btn btn-primary'])[2]";
   public static final String edit_cancel="(//*[contains(@class,'btn btn-info')])[2]";
  public static final String deleteProfile = "//*[@id=\"sp_gridbody\"]/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[4]/div/button";
  public static final String CancelDeleteProfile="(//button[@class='btn btn-info'])[3]"; 
  public static final String YesDeleteProfile="(//button[@class='btn btn-danger'])";
  public static final String CloseDeletePopUp="(//button[@class='close'])[3]";
  public static final String searchModeletProfile1= "//*[@id=\"sp_gridbody\"]/label/input";
 
  
  //assign Profile
  public static final String assignprofiletab = "//*[@id=\"hm_lp_assignProfile\"]";
  public static final String editbutton = "//*[@id=\"sp_gridbody\"]/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[7]/div/button[2]/i";
  public static final String ModeletProfiler_assign_edit ="//*[@id=\"myModal\"]/div/div/form/div[1]/div[2]/div/select"; 
  public static final String assignbutton ="//*[@id=\"update_mp2\"]";
  public static final String closebutton = "//button[@class=\"close\"]";
  public static final String checkbutton="//*[@id=\"sp_gridbody\"]/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[1]/input";
  public static final String RestartAssignButton= "//*[@id=\"restartModelBtn\"]";
  public static final String yesbutton="//*[@id=\"restartModal\"]/div/div/div[3]/div/div[2]/button[1]";
  public static final String restartclosebutton="(//button[@class='close'])[2]";
  public static final String nobutton="(//button[@class=\"btn btn-info\"])[2]";
  public static final String searchbutton= "//*[@id=\"sp_gridbody\"]/label/input";
  
  //model publishing from scratch
  public static final String modeltab= "//*[@id=\"hm_lft_sdbar_Models\"]";
  public static final String addmodel="//*[@id=\"hm_lp_smp\"]";
  public static final String modelname="(//input[@name='modelName_fv'])[1]";
  public static final String modeldescription="(//*[contains(@name,'model_desc_fv')])[1]";
  public static final String model_release_notes ="//*[@id=\"create_new_model_tab\"]/div[3]/div/form/div[1]/div/div[2]/div[7]/div[1]/div";
  public static final String programming_language="(//*[@id=\"pr_lng\"])[1]";
  public static final String Version="(//*[@id=\"pr_lng_version_new_model\"])[1]";
  public static final String AddArtifectButton= "(//*[@id=\"add_artifacts_btn\"])[1]";
  public static final String R_Model_tar_gz_file ="//*[@id=\"create_new_model_tab\"]/div[3]/div/form/div[3]/div[1]/div[3]/div[3]/span";
  public static final String ManifestFile="//*[@id=\"create_new_model_tab\"]/div[3]/div/form/div[3]/div[1]/div[6]/div[3]/span";
  public static final String ModelIODefinition="//*[@id=\"create_new_model_tab\"]/div[3]/div/form/div[3]/div[1]/div[7]/div[5]/span";
  public static final String checksum="(//*[@id=\"checksum_fv\"])[1]";
  public static final String ValidateAndSaveButton="(//div[@class='col-md-2']/button[1])[1]";
  
  //manage model
  public static final String ManageModelTab="//*[@id=\"loaderDiv\"]"; 
  public static final String ModelColumn= "//*[@id=\"center\"]/div/div[2]/div[2]/div/div/div[33]/div[1]";
  public static final String EmailApprovalButton="//*[@id=\"vl_sendPublishApproval\"]/i";
  public static final String publishmodel="//*[@id=\"vl_sendPublishApproval\"]/i";
 
  //Transcation Dashboard
  public static final String dashboardtab="//*[@id=\"hm_lft_sdbar_menu\"]/li[4]/a";
  public static final String transactiontab ="//*[@id=\"hm_lft_sdbar_span_Transaction\"]";
  public static final String searchbasedOn="//*[@id=\"searchType\"]";//*[contains(@name,'searchType')];
  public static final String modelnamedropdown = "//*[contains(@name,'tenantModelName')]";
  public static final String transactionstatus = "//*[contains(@name,'transactionStatus')]";
  public static final String Rundatefrom ="//*[contains(@id,'runAsOfDateFromString')]";
  public static final String Rundateto ="//*[contains(@id,'runAsOfDateToString')]";
  public static final String Transactiontype ="//*[@id=\"transactionType\"]";
  public static final String Searchbutton="//*[@id=\"TransactionDashboard.search\"]";
  public static final String failureType ="//*[@id=\"filter.errorType\"]";
  public static final String tenanttransactionid ="//*[@id=\"filter.clientTransactionID\"]";
  public static final String RATransactionId="//*[@id=\"filter.raTransactionID\"]";
  
  
  //Transaction Dashboard Table
  public static final String TenantTransactionIDColumnMenu="//*[@id=\"hm_lft_sdbar_menu\"]/li[4]/a";
  public static final String TenantTransactionIDDropDown="//*[@id=\"filterType\"]";
  public static final String TenantTransactionIDinputfield="//input[@id='filterText']";
  public static final String ColumnLevel = "//*[@id=\"dLabel\"]";
  public static final String checkbox1 = "//div[@class='ag-pinned-cols-container']/div[1]";
  public static final String Menulinesfordownloadfiles = "(//*[@id=\"action\"]/span)[1]";
  public static final String downloadioinjson = "//div[@class='col-md-12 ng-scope']/button[1]";
  public static final String downloadusagereport = "//div[@class='col-md-12 ng-scope']/button[2]";
  public static final String downloadioinexcel = "//div[@class='col-md-12 ng-scope']/button[3]";
  public static final String downloadexcutionreport = "//div[@class='col-md-12 ng-scope']/button[4]";
  public static final String actionMenu = "//div[@class='ag-body-container']/div[1]/div[7]";
  public static final String downloadtenantio="//div[@class='ag-body-container']/div[1]/div[7]/ul/li[1]";
  public static final String downloadmodeletio="//div[@class='ag-body-container']/div[1]/div[7]/ul/li[2]";
  public static final String reruntransaction="//div[@class='ag-body-container']/div[1]/div[7]/ul/li[3]";
  public static final String reruntransactionExecutebutton="//*[@id=\"execute\"]";
  
//support Library
  public static final String supportLibararytab="(//*[@id=\"hm_lft_sdbar_menu\"]/li[5]/a/span)[1]";
  public static final String addLibararytab="//*[@id=\"hm_lp_addPckg\"]";
  public static final String addLibararybutton="//div[@class='btn btn-primary btn-block btn-file']/span";
  public static final String RVersion="//*[@id=\"envVersion\"]";
  public static final String NobuttonR360 = "//*[@id=\"confirmModal\"]/div/div/div[3]/button[2]";//*[@id="confirmModal"]/div/div/div[3]/button[2]
  public static final String YesbuttonR360="//*[@id=\"confirmModal\"]/div/div/div[3]/button[1]";
  public static final String remove ="//*[@id=\"pu_removeFile\"]";
  public static final String Upload ="(//*[@id=\"pu_uploadFile\"])[2]";
  public static final String managetab="//*[@id=\"hm_lp_lstPckg\"]";
  public static final String managetabsearch="//div[@class='input-group input-group-sm']/input";
  public static final String serachbutton="//*[@id=\"pl_searchVersion_btn\"]";
  public static final String checkbox = "//div[@class='ngSelectionCell ng-scope']/input";
  public static final String Download = "//div[@id='pl_dwnVer']";

  //Modelet Pooling   
  public static final String PoolingTab="//*[@id=\"hm_lft_sdbar_span_ModeletPooling\"]";
  public static final String addpool="//*[@id=\"hm_lp_addPckg\"]";
  public static final String addnewpool ="//*[@id=\"body\"]/div/div[1]/section[2]/div[1]/div[1]/div[1]/div/div[1]/button";
  public static final String poolName = "//*[@id=\"pool_name\"]";
  public static final String modelingEnvAndversion="//*[@id=\"new_env\"]";
  public static final String tenant="//*[@id=\"new_tenant\"]";
  public static final String transactionMode = "//*[@id=\"new_mode\"]";
  public static final String transactiontype = "//*[@id=\"new_transaction\"]";
  public static final String modelandversion ="//*[@id=\"new_model\"]";
  public static final String savebutton = "//*[@id=\"createPoolRow\"]/div/table/tbody/tr/td[11]/button";
  public static final String waitTime = "//*[@id=\"pool_timeout\"]";
  public static final String commit = "//div[@class='modal-footer']/button[2]";
  public static final String confirmYes = "//div[@class='modal-dialog']/div/div[3]/button[1]";
  public static final String deletePool ="//*[@id=\"pool_8\"]/div[1]/div/button";
  public static final String DeleteYes = "//*[@id=\"confirmModal\"]/div/div/div[3]/button[1]";
  public static final String RestartModelet = "//*[@id=\"pool_9\"]/div[2]/div/div[1]/div/div[1]/span";
  
  //new version model publishing
  public static final String createnewVersionButton="//*[@id=\"createNewVersionTab\"]";
  public static final String newmodelname = "(//*[@id=\"modelName_fv_sel\"])[1]";
  public static final String newMinorModelVersion="(//*[@id=\"minorVer_hv\"])[1]";
  public static final String newMinorModelDropDown = "(//*[@id=\"majorVersions_hv\"])[1]";
  public static final String newModelReleaseNotes = "//*[@id=\"create_new_model_tab\"]/div[3]/div/form/div[1]/div/div[2]/div[7]/div[1]/div/div";
  public static final String newmodelVersion = "(//*[@id=\"pr_lng_version_old_model\"])[1]";
  public static final String newartifactButton = "(//*[@id=\"add_artifacts_btn1\"])[1]";
  public static final String selectexitingTargzfile = "(//*[@id=\"pick_existing-r\"])[1]";
  public static final String selectTargz = "//*[@id=\"libGrid\"]/div[2]/div/div[2]/div[2]";//*[@id="defGrid"]/div[2]/div/div[2]/div[2]/div[2]/div
  public static final String okbutton1 = "//*[@id=\"libModal\"]/div/div/div[3]/button";
  public static final String selectexitingmodelio = "(//*[@id=\"pick_model_io\"])[1]";
  public static final String selectmodelio = "//*[@id=\"defGrid\"]/div[2]/div/div[2]/div[2]/div[2]/div";
  public static final String okbutton2 = "//*[@id=\"defModal\"]/div/div/div[3]/button";
  public static final String validateAndSaveButton1 = "(//button[@class='btn btn-primary'])[5]";
  public static final String managetabnew="//*[@id=\"hm_lp_vview\"]";
  public static final String clickonfirstmodeleofmangepage = "//div[@class='ag-body-container']/div[1]/div[1]";
  public static final String emailApproval="(//a[@class='btn btn-app btn-sm design-button ng-scope'])[5]";
  public static final String yesEmailApproval="//*[@id=\"confirmModal\"]/div/div/div[3]/button[1]";
  public static final String testModel="(//a[@class='btn btn-app btn-sm design-button ng-scope'])[2]";
  public static final String testBedExecute="//*[@id=\"execute\"]";
  public static final String cancelTestBedExecute="(//button[@class=\"btn btn-primary btn-sm\"])[2]";
  public static final String viewTab="(//*[@class='btn btn-app btn-sm design-button ng-scope'])[1]";
  
  
 }