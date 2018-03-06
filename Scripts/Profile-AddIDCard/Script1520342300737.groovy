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

WebUI.click(findTestObject('TVLD/MyProfilePage/IDCardLink'))

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIDCard'))

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/Country'), 'PL', true)

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/Number'), '5532556346')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/ExpiryDate'), '10/07/2009')

WebUI.setText(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/CityPlaceOfIssue'), 'Kraków')

WebUI.selectOptionByValue(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/CountryPlaceOfIssue'), 'PL', 
    true)

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/UpdateEmergencyContactPage/SaveChanges'))

WebUI.verifyTextPresent('A new ID Card has been added to your profile.', true)

WebUI.verifyElementText(findTestObject('TVLD/VerifyFields/IDCard/IDNumberVerify'), '5532556346')

WebUI.verifyElementText(findTestObject('TVLD/VerifyFields/IDCard/IDCountryVerify'), 'Poland')

WebUI.verifyElementText(findTestObject('TVLD/VerifyFields/IDCard/IDExpiryDateVerify'), '10/07/2009')

WebUI.click(findTestObject('TVLD/MyProfilePage/PersonalDetailsPage/AddIdCardePage/DeleteIDCard'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.verifyTextPresent('ID Card information has been deleted.', true)

WebUI.closeBrowser()
