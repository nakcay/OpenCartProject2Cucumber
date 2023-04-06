package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPage extends MyMethods {
    public POMPage() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessageForAddToProduct;

    public WebElement getSuccessMessageForAddToProduct() {
        return successMessageForAddToProduct;
    }

    public WebElement getShoppingCartLink() {
        return shoppingCartLink;
    }

    public WebElement getProductInTheCart() {
        return productInTheCart;
    }

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement shoppingCartLink;
    @FindBy(xpath = "//td[text()='Product 14']")
    private WebElement productInTheCart;
    @FindBy(xpath = "//a[text()='Product Compare (1)']")
    private WebElement productCompareLink;

    public WebElement getAddToCartB() {
        return addToCartB;
    }

    @FindBy(xpath = "(//i[@class=\"fa fa-shopping-cart\"])[3]")
    private WebElement addToCartB;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    private WebElement forgotPasswordUnderPasswordButton;

    public WebElement getForgotPasswordUnderPasswordButton() {
        return forgotPasswordUnderPasswordButton;
    }

    @FindBy(xpath = "(//a[text()='Login'])[2]")
    private WebElement loginOnRegisterPage;
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;

    public WebElement getLoginOnRegisterPage() {
        return loginOnRegisterPage;
    }

    public WebElement getRegisterButton() {
        return RegisterButton;
    }

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement RegisterButton;


    @FindBy(xpath = "//span[text()='My Account']/../..//a[text()='Login']")
    private WebElement loginUnderMyAccount;

    @FindBy(id = "input-email")
    private WebElement emailField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(css = "input[type='submit']")
    private WebElement loginButton;

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getLoginUnderMyAccount() {
        return loginUnderMyAccount;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement emailOrPasswordNotMatchMessage;

    public WebElement getEmailNotMatchMessage() {
        return emailOrPasswordNotMatchMessage;
    }

    public WebElement getEmailOrPasswordNotMatchMessage() {
        return emailOrPasswordNotMatchMessage;
    }

    public WebElement getProductCompareLink1() {
        return productCompareLink1;
    }

    @FindBy(id = "compare-total")
    private WebElement productCompareLink1;
    @FindBy(xpath = "//h1[text()='Product Comparison']")
    private WebElement productComparisonHeader;

    public WebElement getProductCompareLink() {
        return productCompareLink;
    }

    public WebElement getProductComparisonHeader() {
        return productComparisonHeader;
    }

    @FindBy(xpath = "(//button[@type='button'])[9]")
    private WebElement compareThisProduct;
    @FindBy(xpath = "//a[text()='Product Compare (1)']")
    private WebElement productCompareLink2;
    @FindBy(xpath = "//input[@type='button']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement ShoppingCartButton;

    public WebElement getProductCompareLink2() {
        return productCompareLink2;
    }

    @FindBy(xpath = "(//a[text()='iMac'])[2]")
    private WebElement itemInTheCart;

    public WebElement getCompareThisProduct() {
        return compareThisProduct;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getShoppingCartButton() {
        return ShoppingCartButton;
    }

    public WebElement getItemInTheCart() {
        return itemInTheCart;
    }

    public WebElement getInTheSuccessMessageProductComparisonLink() {
        return inTheSuccessMessageProductComparisonLink;
    }

    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement inTheSuccessMessageProductComparisonLink;
    @FindBy(xpath = "(//a[text()='iMac'])")
    private WebElement iMacProduct;
    @FindBy(xpath = "//a[text()='Description']")
    private WebElement descriptionOfImac;
    @FindBy(xpath = "//div[@class=\"tab-pane active\"]")
    private WebElement descriptionText;

    public WebElement getiMacProduct() {
        return iMacProduct;
    }

    public WebElement getDescriptionOfImac() {
        return descriptionOfImac;
    }

    public WebElement getDescriptionText() {
        return descriptionText;
    }

    @FindBy(xpath = "(//button[@type='button'])[11]")
    private WebElement compareThisProductIcon;

    public WebElement getCompareThisProductIcon() {
        return compareThisProductIcon;
    }

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement addedSuccessMessage;
    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComparisonLinkInTheSuccessMessage;

    public WebElement getAddedSuccessMessage() {
        return addedSuccessMessage;
    }

    public WebElement getProductComparisonLinkInTheSuccessMessage() {
        return productComparisonLinkInTheSuccessMessage;
    }

    @FindBy(xpath = "//strong[text()='Product Details']")
    private WebElement productDetails;

    public WebElement getProductDetails() {
        return productDetails;
    }

    @FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
    private WebElement appleCinemaItem;
    @FindBy(xpath = "//span[text()='$100.00']")
    private WebElement AppleNetPrice;

    public WebElement getAppleCinemaItem() {
        return appleCinemaItem;
    }

    public WebElement getAppleNetPrice() {
        return AppleNetPrice;
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    private WebElement searchTextBox;

    public WebElement getSearchTextBox() {
        return searchTextBox;
    }

    public WebElement getSearchCriteriaTextBox() {
        return searchCriteriaTextBox;
    }

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement searchCriteriaTextBox;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement searchIcon;

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement searchCriteriaKeywords;

    public WebElement getSearchCriteriaKeywords() {
        return searchCriteriaKeywords;
    }

    @FindBy(xpath = "(//div[@id='product-search']//ul/li)[1]")
    private WebElement homeButtonOnTheBreadCrumb;
    @FindBy(xpath = "(//div[@id='product-search']//ul/li)[2]")
    private WebElement searchButtonOnTheBreadCrumb;

    public WebElement getHomeButtonOnTheBreadCrumb() {
        return homeButtonOnTheBreadCrumb;
    }

    public WebElement getSearchButtonOnTheBreadCrumb() {
        return searchButtonOnTheBreadCrumb;
    }

    @FindBy(xpath = "//a[@id='wishlist-total']")
    private WebElement wishListButton;
    @FindBy(xpath = "//a[text()='My Wish List']")
    private WebElement myWishListButtonOnTheBreadCrumb;

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getMyWishListButtonOnTheBreadCrumb() {
        return myWishListButtonOnTheBreadCrumb;
    }

    @FindBy(xpath = "//a[text()='MacBook']")
    private WebElement featureMacBook;
    @FindBy(xpath = "(//button[@type='button'])[7]")
    private WebElement addToCartButtonOfMacbook;
    @FindBy(xpath = "(//button[@type='button'])[11]")//
    private WebElement WishListButtonOfMacBook;
    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement compareThisProductButtonOfMacBook;

    @FindBy(xpath = "//a[text()='iPhone']")
    private WebElement featureIphone;
    @FindBy(xpath = "(//button[@type='button'])[12]")
    private WebElement addToCartButtonOfIphone;
    @FindBy(xpath = "(//button[@type='button'])[14]")
    private WebElement wishListButtonOfIphone;
    @FindBy(xpath = "(//button[@type='button'])[15]")
    private WebElement compareThisProductButtonOfIphone;

    @FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
    private WebElement featureAppleCinema;
    @FindBy(xpath = "(//button[@type='button'])[14]")
    private WebElement addToCartButtonOfAppleCinema;
    @FindBy(xpath = "(//button[@type='button'])[17]")
    private WebElement wishListButtonOfAppleCinema;
    @FindBy(xpath = "(//button[@type='button'])[18]")
    private WebElement compareThisProductButtonOfAppleCinema;

    @FindBy(xpath = "//a[text()='Canon EOS 5D']")
    private WebElement featureCanon;
    @FindBy(xpath = "(//button[@type='button'])[17]")
    private WebElement addToCartButtonOfCanon;
    @FindBy(xpath = "(//button[@type='button'])[20]")
    private WebElement wishListButtonOfCanon;
    @FindBy(xpath = "(//button[@type='button'])[21]")
    private WebElement compareThisProductButtonOfCanon;

    public WebElement getFeatureMacBook() {
        return featureMacBook;
    }

    public WebElement getAddToCartButtonOfMacbook() {
        return addToCartButtonOfMacbook;
    }

    public WebElement getWishListButtonOfMacBook() {
        return WishListButtonOfMacBook;
    }

    public WebElement getCompareThisProductButtonOfMacBook() {
        return compareThisProductButtonOfMacBook;
    }

    public WebElement getFeatureIphone() {
        return featureIphone;
    }

    public WebElement getAddToCartButtonOfIphone() {
        return addToCartButtonOfIphone;
    }

    public WebElement getWishListButtonOfIphone() {
        return wishListButtonOfIphone;
    }

    public WebElement getCompareThisProductButtonOfIphone() {
        return compareThisProductButtonOfIphone;
    }

    public WebElement getFeatureAppleCinema() {
        return featureAppleCinema;
    }

    public WebElement getAddToCartButtonOfAppleCinema() {
        return addToCartButtonOfAppleCinema;
    }

    public WebElement getWishListButtonOfAppleCinema() {
        return wishListButtonOfAppleCinema;
    }

    public WebElement getCompareThisProductButtonOfAppleCinema() {
        return compareThisProductButtonOfAppleCinema;
    }

    public WebElement getFeatureCanon() {
        return featureCanon;
    }

    public WebElement getAddToCartButtonOfCanon() {
        return addToCartButtonOfCanon;
    }

    public WebElement getWishListButtonOfCanon() {
        return wishListButtonOfCanon;
    }

    public WebElement getCompareThisProductButtonOfCanon() {
        return compareThisProductButtonOfCanon;
    }
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageAddToCartOfMacbook;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageAddToCartOfIphone;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageAddToCartOfAppleCinema;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageAddToCartOfCanon;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement alertMessageWishListOfMacbook;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement alertMessageWishListOfIphone;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement alertMessageWishListOfAppleCinema;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement alertMessageWishListOfCanon;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageCompareThisProductOfMacbook;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageCompareThisProductOfIphone;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageCompareThisProductOfAppleCinema;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    private WebElement successMessageCompareThisProductOfCanon;

    public WebElement getSuccessMessageAddToCartOfMacbook() {
        return successMessageAddToCartOfMacbook;
    }

    public WebElement getSuccessMessageAddToCartOfIphone() {
        return successMessageAddToCartOfIphone;
    }

    public WebElement getSuccessMessageAddToCartOfAppleCinema() {
        return successMessageAddToCartOfAppleCinema;
    }

    public WebElement getSuccessMessageAddToCartOfCanon() {
        return successMessageAddToCartOfCanon;
    }

    public WebElement getAlertMessageWishListOfMacbook() {
        return alertMessageWishListOfMacbook;
    }

    public WebElement getAlertMessageWishListOfIphone() {
        return alertMessageWishListOfIphone;
    }

    public WebElement getAlertMessageWishListOfAppleCinema() {
        return alertMessageWishListOfAppleCinema;
    }

    public WebElement getAlertMessageWishListOfCanon() {
        return alertMessageWishListOfCanon;
    }

    public WebElement getSuccessMessageCompareThisProductOfMacbook() {
        return successMessageCompareThisProductOfMacbook;
    }

    public WebElement getSuccessMessageCompareThisProductOfIphone() {
        return successMessageCompareThisProductOfIphone;
    }

    public WebElement getSuccessMessageCompareThisProductOfAppleCinema() {
        return successMessageCompareThisProductOfAppleCinema;
    }

    public WebElement getSuccessMessageCompareThisProductOfCanon() {
        return successMessageCompareThisProductOfCanon;
    }
    @FindBy(xpath = "(//button[@type='button'])[10]")
    private WebElement addtocartImacs;

    public WebElement getAddtocartImacs() {
        return addtocartImacs;
    }
    @FindBy(linkText = "Use Coupon Code")
    private WebElement useCouponCode;
    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement enterYourCoupon;
    @FindBy(xpath = "(//input[@type='button'])")
    private WebElement applyCoupon;
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]")
    private WebElement WarningMessageOfCoupon;

    public WebElement getUseCouponCode() {
        return useCouponCode;
    }

    public WebElement getEnterYourCoupon() {
        return enterYourCoupon;
    }

    public WebElement getApplyCoupon() {
        return applyCoupon;
    }

    public WebElement getWarningMessageOfCoupon() {
        return WarningMessageOfCoupon;
    }
    @FindBy(xpath = "(//button[@type='button'])[9]")
    private WebElement addtocartonthesearchpage;
    @FindBy(xpath = "//a[text()='Site Map']")
    private WebElement siteMapOnTheFooter;

    public WebElement getAddtocartonthesearchpage() {
        return addtocartonthesearchpage;
    }

    public WebElement getSiteMapOnTheFooter() {
        return siteMapOnTheFooter;
    }
        @FindBy(xpath = "(//button[@type='button'])[11]")
                private WebElement compareThisProducticonLoc;

    public WebElement getCompareThisProducticonLoc() {
        return compareThisProducticonLoc;
    }
    @FindBy(xpath = "//a[text()='Checkout']")
    private  WebElement checkoutButtonOnTheBottom;

    public WebElement getCheckoutButtonOnTheBottom() {
        return checkoutButtonOnTheBottom;
    }

    public WebElement getCheckoutButtonOnTheTop() {
        return checkoutButtonOnTheTop;
    }

    @FindBy(xpath = "//a[@title='Checkout']")
    private WebElement checkoutButtonOnTheTop;
    @FindBy(xpath = "(//p[text()='Your shopping cart is empty!'])[2]")
    private WebElement shoppingCartVerificationText;

    public WebElement getShoppingCartVerificationText() {
        return shoppingCartVerificationText;
    }
    @FindBy(xpath = "//span[text()='Checkout']")
    private  WebElement checkoutofFireFox;

    public WebElement getCheckoutofFireFox() {
        return checkoutofFireFox;
    }
    @FindBy(xpath = "(//a[@data-parent='#accordion'])[3]")
    private WebElement useGiftCartCertificateOptions;
    @FindBy(xpath = "//span//input[@type='submit']")
    private WebElement applyGiftCertificateButton;

    public WebElement getUseGiftCartCertificateOptions() {
        return useGiftCartCertificateOptions;
    }

    public WebElement getApplyGiftCertificateButton() {
        return applyGiftCertificateButton;
    }

    public WebElement getWarningMessageForGiftCertification() {
        return warningMessageForGiftCertification;
    }

    @FindBy(css = ".alert.alert-danger.alert-dismissible")
    private WebElement warningMessageForGiftCertification;
    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement wannaUseANewAddressRadioButton;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement firstNamePLaceHolder;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    private WebElement lastNamePLaceHolder;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    private WebElement companyPLaceHolder;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    private WebElement address1PLaceHolder;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    private WebElement address2PLaceHolder;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    private WebElement cityPLaceHolder;
    @FindBy(xpath = "(//input[@type='text'])[8]")
    private WebElement postalCodePLaceHolder;

    public WebElement getWannaUseANewAddressRadioButton() {
        return wannaUseANewAddressRadioButton;
    }

    public WebElement getFirstNamePLaceHolder() {
        return firstNamePLaceHolder;
    }

    public WebElement getLastNamePLaceHolder() {
        return lastNamePLaceHolder;
    }

    public WebElement getCompanyPLaceHolder() {
        return companyPLaceHolder;
    }

    public WebElement getAddress1PLaceHolder() {
        return address1PLaceHolder;
    }

    public WebElement getAddress2PLaceHolder() {
        return address2PLaceHolder;
    }

    public WebElement getCityPLaceHolder() {
        return cityPLaceHolder;
    }

    public WebElement getPostalCodePLaceHolder() {
        return postalCodePLaceHolder;
    }
}






