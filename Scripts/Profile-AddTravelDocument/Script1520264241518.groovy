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

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('TVLD/MyProfile'))

WebUI.click(findTestObject('TVLD/MyProfilePage/TravelDocumentLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocument'))

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/Type'), 'VI', true)

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/CountryWhereTheDocumentApplies'), 
    'PL', true)

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/Number'), '4012888888881881')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/ExpiryDate'), '10/07/2020')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddPassportPage/CityPlaceOfIssue'), 'Kraków')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/CountryPlaceOfIssue'), 
    'PL', true)

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/SaveChanges'))

WebUI.verifyTextPresent('A new Travel document has been added to your profile.', true)

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TravelDocument/NumberVerify'), '4012888888881881')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TravelDocument/TypeVerify'), 'VI')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TravelDocument/CountryVerify'), 'Poland')

WebUI.verifyElementText(findTestObject('TVLD/VerifyMyProfileFields/TravelDocument/ExpiryDateVerify'), '10/07/2020')

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddTravelDocumentPage/DeleteTravelDocument'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Travel document information has been deleted.', true)

WebUI.closeBrowser()

