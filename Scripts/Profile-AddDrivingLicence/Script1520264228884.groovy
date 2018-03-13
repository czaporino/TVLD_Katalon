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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.traveldoo.com/auth/sso/saml2/home/SHOP_ABBG')

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('HomePage/MyProfile'))

WebUI.click(findTestObject('MyProfilePage/DrivingLicenceLink'))

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicence'))

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/Country'), 'PL', 
    true)

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/Number'), '5532556346')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/DateOfIssue'), '10/07/2009')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/CityPlaceOfIssue'), 'Kraków')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/CountryPlaceOfIssue'), 
    'PL', true)

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/SaveChanges'))

WebUI.verifyTextPresent('A new driving licence has been added to your profile.', true)

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/DrivingLicence/DrivingLicenceNumberVerify'), '5532556346')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/DrivingLicence/DrivingLicenceCoutryVerify'), 'Poland')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/DrivingLicence/DrivingLicenceDateOfIssueVerify'), '10/07/2009')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/DrivingLicence/DrivingLicencePlaceOfIssueVerify'), 'Kraków')

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/AddDrivingLicencePage/DeleteDrivingLicence'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Driving licence information has been deleted.', true)

WebUI.closeBrowser()

