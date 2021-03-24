package kindlebookspage;

public class HomePageWebElement {


    //************       kindle books web elements    ****************

    public static final String kindleBooksLocator = "//a[contains(text(),'Kindle Books')]";
    public static final String buyAKindleLocator = "//span[contains(text(),'Buy a Kindle')]";
    public static final String kindleEbooksLocator = "//span[@class='nav-a-content'][normalize-space()='Kindle eBooks']";
    public static final String kindleUnlimitedLocator = "div[id='nav-progressive-subnav'] a:nth-child(3) span:nth-child(1)";
    public static final String primeReadingLocator = "div[id='nav-progressive-subnav'] a:nth-child(4) span:nth-child(1)";
    public static final String bestSellersAndMoreLocator = "//span[contains(text(),'Best Sellers & More')]";
    public static final String kindleBookDealsLocator = "//span[contains(text(),'Kindle Book Deals')]";
    public static final String kindleSinglesLocator = "//span[contains(text(),'Kindle Singles')]";
    public static final String newsStandLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[8]";

    public static final String manageContentAndDevicesLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[9]";

    public static final String advancedSearchLocator = "//span[contains(text(),'Advanced Search')]";
    public static final String kindleBooksSearchBoxLocator = "//select[@id='searchDropdownBox']";
    public static final String searchButtonLocator = "//input[@id='nav-search-submit-button']";
    public static final String popularInKindleLocator = "//h3[contains(text(),'Popular in Kindle')]/..//ul//li";


    //******************** buy a kindle web elements ***************

    public static final String amazonDevicesLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[1]/span[1]";
    public static final String echoAndAlexaLocator = "//span[contains(text(),'Echo & Alexa')]";
    public static final String fireAndTabletsLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[3]/span[1]";
    public static final String amazonFireTVLocator = "//span[contains(text(),'Amazon Fire TV')]";
    public static final String kindleLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[5]";
    public static final String homeSecurityLocator = "body.a-m-us.a-aui_72554-c.a-aui_mm_desktop_exp_291916-c.a-aui_mm_desktop_launch_291918-c.a-aui_mm_desktop_targeted_exp_291928-c.a-aui_mm_desktop_targeted_launch_291922-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_tnr_v2_180836-c:nth-child(2) header.nav-opt-sprite.nav-flex.nav-locale-us.nav-lang-en.nav-ssl.nav-unrec.nav-progressive-attribute:nth-child(22) div.nav-sprite-v1.celwidget.nav-bluebeacon.nav-a11y-t1.bold-focus-hover.layout2.nav-flex.nav-packard-glow.hamburger.layout3.layout3-alt.nav-progressive-attribute div:nth-child(6) div:nth-child(2) a.nav-a:nth-child(6) > span.nav-a-content";
    public static final String day1EditionsLocator = "body.a-m-us.a-aui_72554-c.a-aui_mm_desktop_exp_291916-c.a-aui_mm_desktop_launch_291918-c.a-aui_mm_desktop_targeted_exp_291928-c.a-aui_mm_desktop_targeted_launch_291922-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_tnr_v2_180836-c:nth-child(2) header.nav-opt-sprite.nav-flex.nav-locale-us.nav-lang-en.nav-ssl.nav-unrec.nav-progressive-attribute:nth-child(22) div.nav-sprite-v1.celwidget.nav-bluebeacon.nav-a11y-t1.bold-focus-hover.layout2.nav-flex.nav-packard-glow.hamburger.layout3.layout3-alt.nav-progressive-attribute div:nth-child(6) div:nth-child(2) a.nav-a:nth-child(7) > span.nav-a-content";
    public static final String day1EditionsTextLocator = "//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/strong[1]";
    public static final String deviceDealsLocator = "//span[contains(text(),'Device Deals')]";
    public static final String deviceDealsTextLocator = "//h1[contains(text(),'Amazon Device Deals')]";
    public static final String newReleaseLocator = "//span[contains(text(),'New Releases')]";
    public static final String accessoriesLocator = "//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[9]/span[1]";
    public static final String certifiedRefurbishedLocator = "//span[contains(text(),'Certified Refurbished')]";






    //************       advanced search web elements    ****************
    public static final String advancedSearchLocato = "//span[contains(text(),'Advanced Search')]";
    public static final String authorLocator = "//tbody/tr[1]/td[1]/div[2]/input[1]";
    public static final String keywordLocator = "//tbody/tr[1]/td[1]/div[1]/input[1]";
    public static final String titleLocator = "//tbody/tr[1]/td[1]/div[3]/input[1]";
    public static final String publisherLocator = "//tbody/tr[1]/td[1]/div[5]/input[1]";
    public static final String searchButtonLocator1 = "//tbody/tr[2]/td[1]/input[1]";
    public static final String subjectLocator = "//tbody/tr[1]/td[2]/div[1]/select[1]";
    public static final String languageLocator = "//tbody/tr[1]/td[2]/div[2]/select[1]";
    public static final String pub_dateLocator = "//tbody/tr[2]/td[1]/select[1]";
    public static final String monthLocator = "//tbody/tr[2]/td[2]/select[1]";
    public static final String yearLocator = "//tbody/tr[2]/td[3]/input[1]";
    public static final String sortResultsByLocator = "//tbody/tr[1]/td[2]/div[4]/select[1]";
    public static final String textLocator = "//span[contains(text(),'Try checking your spelling or use more general ter')]";


    //************      book  advanced search web elements    ****************
    public static final String booksLocator = "//tbody/tr[1]/td[1]/div[4]/a[1]";
    public static final String keywordsLocator = "//tbody/tr[1]/td[1]/div[1]/input[1]";
    public static final String authorsLocator = "//tbody/tr[1]/td[1]/div[2]/input[1]";
    public static final String title1Locator = "//tbody/tr[1]/td[1]/div[3]/input[1]";
    public static final String isbnLocator = "//input[@id='field-isbn']";
    public static final String publisher1Locator = "//tbody/tr[1]/td[1]/div[5]/input[1]";
    public static final String subject1Locator = "//tbody/tr[1]/td[1]/div[6]/select[1]";
    public static final String conditionLocator = "//tbody/tr[1]/td[2]/div[1]/select[1]";
    public static final String formatLocator = "//tbody/tr[1]/td[2]/div[2]/select[1]";
    public static final String readerAgeLocator = "//tbody/tr[1]/td[2]/div[3]/select[1]";
    public static final String language1Locator = "//tbody/tr[1]/td[2]/div[4]/select[1]";
    public static final String pub_date1Locator = "//tbody/tr[2]/td[1]/select[1]";
    public static final String month1Locator = "//tbody/tr[2]/td[2]/select[1]";
    public static final String year1Locator = "//tbody/tr[2]/td[3]/input[1]";
    public static final String sortResultsBy1Locator = "//tbody/tr[1]/td[2]/div[6]/select[1]";
    public static final String searchButton1Locator = "//tbody/tr[2]/td[1]/input[1]";
    public static final String kindleBooksSearchTextLocator = "//body/div[@id='a-page']/div[2]/div[1]/div[1]/div[1]/div[1]/h1[1]";
    public static final String  KindleBooksAdvancedSearchTextLocator= "//div[contains(text(),'Kindle Books Search')]";
    public static final String magazinesLocator = "//a[contains(text(),'Magazines')]";
    public static final String kindleNewsStandLocator = "//a[contains(text(),'Kindle Newsstand')]";
    public static final String musicLocator = "//tbody/tr[1]/td[1]/div[6]/a[1]";
    public static final String classicalMusicLocator = "//a[contains(text(),'Classical Music')]";
    public static final String moviesAndTVLocator = "//a[contains(text(),'Movies & TV')]";
    public static final String toysAndGamesLocator = "//tbody/tr[1]/td[1]/div[9]/a[1]";

}
