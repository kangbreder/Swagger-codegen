//
// PutSelfLoansLoanIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutSelfLoansLoanIdRequest: Codable {

    public var locale: String?
    public var dateFormat: String?
    public var productId: Int?
    public var principal: Int64?
    public var loanTermFrequency: Int?
    public var loanTermFrequencyType: Int?
    public var numberOfRepayments: Int?
    public var repaymentEvery: Int?
    public var repaymentFrequencyType: Int?
    public var interestRatePerPeriod: Int?
    public var interestType: Int?
    public var interestCalculationPeriodType: Int?
    public var amortizationType: Int?
    public var expectedDisbursementDate: String?
    public var transactionProcessingStrategyId: Int?

    public init(locale: String?, dateFormat: String?, productId: Int?, principal: Int64?, loanTermFrequency: Int?, loanTermFrequencyType: Int?, numberOfRepayments: Int?, repaymentEvery: Int?, repaymentFrequencyType: Int?, interestRatePerPeriod: Int?, interestType: Int?, interestCalculationPeriodType: Int?, amortizationType: Int?, expectedDisbursementDate: String?, transactionProcessingStrategyId: Int?) {
        self.locale = locale
        self.dateFormat = dateFormat
        self.productId = productId
        self.principal = principal
        self.loanTermFrequency = loanTermFrequency
        self.loanTermFrequencyType = loanTermFrequencyType
        self.numberOfRepayments = numberOfRepayments
        self.repaymentEvery = repaymentEvery
        self.repaymentFrequencyType = repaymentFrequencyType
        self.interestRatePerPeriod = interestRatePerPeriod
        self.interestType = interestType
        self.interestCalculationPeriodType = interestCalculationPeriodType
        self.amortizationType = amortizationType
        self.expectedDisbursementDate = expectedDisbursementDate
        self.transactionProcessingStrategyId = transactionProcessingStrategyId
    }


}

