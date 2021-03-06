//
// GetLoanAccountingMappings.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoanAccountingMappings: Codable {

    public var fundSourceAccount: GetLoanFundSourceAccount?
    public var loanPortfolioAccount: GetLoanPortfolioAccount?
    public var transfersInSuspenseAccount: GetLoanTransfersInSuspenseAccount?
    public var interestOnLoanAccount: GetLoanInterestOnLoanAccount?
    public var incomeFromFeeAccount: GetLoanIncomeFromFeeAccount?
    public var incomeFromPenaltyAccount: GetLoanIncomeFromPenaltyAccount?
    public var writeOffAccount: GetLoanWriteOffAccount?
    public var overpaymentLiabilityAccount: GetLoanOverpaymentLiabilityAccount?

    public init(fundSourceAccount: GetLoanFundSourceAccount?, loanPortfolioAccount: GetLoanPortfolioAccount?, transfersInSuspenseAccount: GetLoanTransfersInSuspenseAccount?, interestOnLoanAccount: GetLoanInterestOnLoanAccount?, incomeFromFeeAccount: GetLoanIncomeFromFeeAccount?, incomeFromPenaltyAccount: GetLoanIncomeFromPenaltyAccount?, writeOffAccount: GetLoanWriteOffAccount?, overpaymentLiabilityAccount: GetLoanOverpaymentLiabilityAccount?) {
        self.fundSourceAccount = fundSourceAccount
        self.loanPortfolioAccount = loanPortfolioAccount
        self.transfersInSuspenseAccount = transfersInSuspenseAccount
        self.interestOnLoanAccount = interestOnLoanAccount
        self.incomeFromFeeAccount = incomeFromFeeAccount
        self.incomeFromPenaltyAccount = incomeFromPenaltyAccount
        self.writeOffAccount = writeOffAccount
        self.overpaymentLiabilityAccount = overpaymentLiabilityAccount
    }


}

