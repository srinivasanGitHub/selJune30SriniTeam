Feature:  Claim Acknowledge

Background: 

Given ECC Application is launched
And Username is entered as XXXX
And Password is entered as XXXX
When Click on Login 
Then Verify the dashboard appears 
And Click on Insurance
And Click on Claim Settlement
Then Verify the Claim settlement page displayed

Scenario Outline: Claim (Full) settlement- Creation

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
And Click Settlement Amount 
Then verify it shows the settlement amount page with AddNew Asset Record
And click Add New Record as  
Then Verify it shows the assert details fields
And select Assert Type 
And Enter assert amount as <100>
And Enter gross amount as <50>
Then click update
Then Click Submit

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|AssertAmount|AssertAmount|
|Full|4111|07/30/2018|SBI|100|50|


Scenario: Claim  settlement- Creation without any input direct submit

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
Then Click Submit
Then Verify it shows the valid error messages for all the fields 

Scenario Outline: Claim (partial) settlement- Creation

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
And Click Settlement Amount 
Then verify it shows the settlement amount page with AddNew Asset Record
And click Add New Record
Then Verify it shows the assert details fields
And select Assert Type
And Enter assert amount as <100>
And Enter gross amount as <50>
Then click update
Then Click Submit

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|AssertAmount|AssertAmount|
|Partial|4111|07/30/2018|SBI|100|50|


Scenario: Claim settlement- Creation without any input click  submit after clicking add new record

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
Then Click Submit
Then Verify it shows the valid error messages for all the fields 

Scenario: Claim settlement- Creation without receipt details

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
Then Click Submit
Then Verify it shows the valid error messages for all the fields 

Scenario Outline: Claim settlement (Full)- Creation without receiptNumber field 

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
Then Click Submit
Then Verify it shows the valid error messages for receipt Number field 

Examples:
|settlementType|
|Full|

Scenario Outline: Claim settlement (Partial)- Creation without receipt details

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
Then Click Submit
Then Verify it shows the valid error messages for receipt Number field 

Examples:
|settlementType|
|Partial|



Scenario Outline: Claim settlement (Full)- Creation without receipt Date

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
Then Click Submit
Then Verify it shows the valid error messages for receipt Date field 

Examples:
|settlementType|ReceiptNum|
|Full|4111|

Scenario Outline: Claim settlement (Partial)- Creation without receipt Date

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
Then Click Submit
Then Verify it shows the valid error messages for receipt Date field 

Examples:
|settlementType|ReceiptNum|
|Partial|4111|


Scenario Outline: Claim settlement (Full)- Creation without BankDetails

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
Then Click Submit
Then Verify it shows the valid error messages for  BankDetails

Examples:
|settlementType|ReceiptNum|ReceiptDate|
|Full|4111|07/30/2018|

Scenario Outline: Claim settlement (Partial)- Creation without BankDetails

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
Then Click Submit
Then Verify it shows the valid error messages for  BankDetails

Examples:
|settlementType|ReceiptNum|ReceiptDate|
|Partial|4111|07/30/2018|

Scenario Outline: Claim settlement (Full)- Creation without SettlementAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Submit
Then Verify it shows the valid error messages for SettlementAmount

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Full|4111|07/30/2018|SBI|

Scenario Outline: Claim settlement (Partial)- Creation without SettlementAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Submit
Then Verify it shows the valid error messages for SettlementAmount

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Partial|4111|07/30/2018|SBI|


Scenario Outline: Claim settlement (Partial)- Creation without receipt details

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
Then Click Update
Then Verify it shows the valid error messages for receipt Number field 

Examples:
|settlementType|
|Partial|



Scenario Outline: Claim settlement (Full)- Creation without receipt Date

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
Then Click Update
Then Verify it shows the valid error messages for receipt Date field 

Examples:
|settlementType|ReceiptNum|
|Full|4111|

Scenario Outline: Claim settlement (Partial)- Creation without receipt Date

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
Then Click Update
Then Verify it shows the valid error messages for receipt Date field 

Examples:
|settlementType|ReceiptNum|
|Partial|4111|


Scenario Outline: Claim settlement (Full)- Creation without BankDetails

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
Then Click Update
Then Verify it shows the valid error messages for  BankDetails

Examples:
|settlementType|ReceiptNum|ReceiptDate|
|Full|4111|07/30/2018|

Scenario Outline: Claim settlement (Partial)- Creation without BankDetails

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
Then Click Update
Then Verify it shows the valid error messages for  BankDetails

Examples:
|settlementType|ReceiptNum|ReceiptDate|
|Partial|4111|07/30/2018|

Scenario Outline: Claim settlement (Full)- Creation without SettlementAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Update
Then Verify it shows the valid error messages for SettlementAmount

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Full|4111|07/30/2018|SBI|

Scenario Outline: Claim settlement (Partial)- Creation without SettlementAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Update
Then Verify it shows the valid error messages for SettlementAmount

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Partial|4111|07/30/2018|SBI|


Scenario Outline: Claim settlement (Full)- Creation click SettleAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Amount
Then Verify it shows Recieved settlement Amount page with assest grid if claim has any assets

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Full|4111|07/30/2018|SBI|

Scenario Outline: Claim settlement (Partial)- Creation click SettleAmount

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Amount
Then Verify it shows Recieved settlement Amount page with assest grid if claim has any assets

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Partial|4111|07/30/2018|SBI|


Scenario Outline: Claim settlement (Full)- Creation click Proceed in Recieved settlement Amount page

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Full>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Amount
Then Click Proceed 
Then Verify it shows error message  to add atleast one asset record

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Full|4111|07/30/2018|SBI|

Scenario Outline: Claim settlement (Partial)- Creation  click Proceed in Recieved settlement Amount page

When Click on first claim number from grid
Then verify it shows the selected claim settlement page
And click Add new record
And Select settlement type as <Partial>
And Enter receipet number as <4111>
And Select receipt date as <07/30/2018>
And Enter Bank Details as <SBI>  
Then Click Amount
Then Click Proceed 
Then Verify it shows error message  to add atleast one asset record

Examples:
|settlementType|ReceiptNum|ReceiptDate|BankDetails|
|Partial|4111|07/30/2018|SBI|



