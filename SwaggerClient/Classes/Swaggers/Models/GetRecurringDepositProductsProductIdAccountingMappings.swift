//
// GetRecurringDepositProductsProductIdAccountingMappings.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRecurringDepositProductsProductIdAccountingMappings: Codable {

    public var savingsReferenceAccount: GetRecurringDepositProductsProductIdSavingsReferenceAccount?
    public var incomeFromFeeAccount: GetRecurringDepositProductsProductIdIncomeFromFeeAccount?
    public var incomeFromPenaltyAccount: GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount?
    public var interestOnSavingsAccount: GetRecurringDepositProductsProductIdInterestOnSavingsAccount?
    public var savingsControlAccount: GetRecurringDepositProductsProductIdSavingsControlAccount?
    public var transfersInSuspenseAccount: GetRecurringDepositProductsProductIdTransfersInSuspenseAccount?

    public init(savingsReferenceAccount: GetRecurringDepositProductsProductIdSavingsReferenceAccount?, incomeFromFeeAccount: GetRecurringDepositProductsProductIdIncomeFromFeeAccount?, incomeFromPenaltyAccount: GetRecurringDepositProductsProductIdIncomeFromPenaltyAccount?, interestOnSavingsAccount: GetRecurringDepositProductsProductIdInterestOnSavingsAccount?, savingsControlAccount: GetRecurringDepositProductsProductIdSavingsControlAccount?, transfersInSuspenseAccount: GetRecurringDepositProductsProductIdTransfersInSuspenseAccount?) {
        self.savingsReferenceAccount = savingsReferenceAccount
        self.incomeFromFeeAccount = incomeFromFeeAccount
        self.incomeFromPenaltyAccount = incomeFromPenaltyAccount
        self.interestOnSavingsAccount = interestOnSavingsAccount
        self.savingsControlAccount = savingsControlAccount
        self.transfersInSuspenseAccount = transfersInSuspenseAccount
    }


}

