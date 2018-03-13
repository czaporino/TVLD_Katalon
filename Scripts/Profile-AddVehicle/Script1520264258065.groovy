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

WebUI.click(findTestObject('HomePage/MyProfile'))

WebUI.click(findTestObject('MyProfilePage/VehicleLink'))

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehicle'))

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/Make'), 'Volvo')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/VehicleType'), 'VEHICLE_TYPE_CAR', 
    true)

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/Model'), 'S40')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/RegistrationNumber'), 'RKA12345')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/Colour'), 'red')

WebUI.setText(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/EngineSize'), '1900')

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/SelectCVorCC'), 'CC', true)

WebUI.selectOptionByValue(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/FuelType'), 'FUEL_TYPE_DIESEL', 
    true)

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/SaveChanges'))

WebUI.verifyTextPresent('A new vehicle has been added to your profile.', true)

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/MakeVerify'), 'Volvo')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/VehicleTypeVerify'), 'Car')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/RegistrationNumberVerify'), 'RKA12345')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/EngineSizeVerify'), '1900  CC')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/FuelTypeVerify'), 'Diesel')

WebUI.verifyElementText(findTestObject('VerifyMyProfileFields/Vehicle/CategoryVerify'), 'Personal Vehicle')

WebUI.click(findTestObject('MyProfilePage/PersonalDetailsPage/AddVehiclePage/DeleteVehicle'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.verifyTextPresent('Vehicule information has been deleted.', true)

WebUI.closeBrowser()

