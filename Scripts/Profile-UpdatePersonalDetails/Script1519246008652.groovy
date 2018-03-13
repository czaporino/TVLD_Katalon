import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.traveldoo.com/auth/sso/saml2/home/SHOP_ABBG')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('HomePage/MyProfile'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsLink'))

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetails'))

WebUI.waitForPageLoad(1)

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/Title'), 'Melle', 
    false)

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/FirstName'), 'Anna')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/MiddleName'), 'Maria')

WebUI.setText(findTestObject('MyProfilePage/CreditCardsPage/LastName'), 'Nowak')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/DateOfBirth'), '01/01/1999')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/Nationality'), 
    'DE', true)

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/CountryOfResidence'), 
    'DE', true)

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/EmployeeID'), '1234567890')

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/SaveChanges'))

WebUI.verifyTextPresent('ID information has been updated', true)

WebUI.waitForPageLoad(1)

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/PersonalDetails/NameVerify'), 'Miss Anna Maria Nowak')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/PersonalDetails/DateOfBirthVerify'), '01/01/1999')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/PersonalDetails/NationalityVerify'), 'Germany')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/PersonalDetails/CoutryOfResidenceVerify'), 'Germany')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/PersonalDetails/EmployeeIDVerify'), '1234567890')

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetails'))

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/FirstName'), 'Lukasz')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/MiddleName'), 'Bartosz')

WebUI.setText(findTestObject('MyProfilePage/CreditCardsPage/LastName'), 'Skrzypek')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/DateOfBirth'), '01/01/1995')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/Nationality'), 
    'PL', true)

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/CountryOfResidence'), 
    'PL', true)

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/EmployeeID'), '987654321')

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/UpdatePersonalDetailsPage/SaveChanges'))

WebUI.verifyTextPresent('ID information has been updated', true)

WebUI.closeBrowser()

