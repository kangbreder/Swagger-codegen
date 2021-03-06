//
// PostSelfLoansRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostSelfLoansRequest: Codable {

    public var dateFormat: String?
    public var locale: String?
    public var clientId: Int?
    public var productId: Int?
    public var principal: Double?
    public var loanTermFrequency: Int?
    public var loanTermFrequencyType: Int?
    public var loanType: String?
    public var numberOfRepayments: Int?
    public var repaymentEvery: Int?
    public var repaymentFrequencyType: Int?
    public var interestRatePerPeriod: Int?
    public var amortizationType: Int?
    public var interestType: Int?
    public var interestCalculationPeriodType: Int?
    public var transactionProcessingStrategyId: Int?
    public var expectedDisbursementDate: String?
    public var submittedOnDate: String?
    public var linkAccountId: Int?
    public var fixedEmiAmount: Int?
    public var maxOutstandingLoanBalance: Int64?
    public var disbursementData: [PostSelfLoansDisbursementData]?
    public var datatables: [PostSelfLoansDatatables]?

    public init(dateFormat: String?, locale: String?, clientId: Int?, productId: Int?, principal: Double?, loanTermFrequency: Int?, loanTermFrequencyType: Int?, loanType: String?, numberOfRepayments: Int?, repaymentEvery: Int?, repaymentFrequencyType: Int?, interestRatePerPeriod: Int?, amortizationType: Int?, interestType: Int?, interestCalculationPeriodType: Int?, transactionProcessingStrategyId: Int?, expectedDisbursementDate: String?, submittedOnDate: String?, linkAccountId: Int?, fixedEmiAmount: Int?, maxOutstandingLoanBalance: Int64?, disbursementData: [PostSelfLoansDisbursementData]?, datatables: [PostSelfLoansDatatables]?) {
        self.dateFormat = dateFormat
        self.locale = locale
        self.clientId = clientId
        self.productId = productId
        self.principal = principal
        self.loanTermFrequency = loanTermFrequency
        self.loanTermFrequencyType = loanTermFrequencyType
        self.loanType = loanType
        self.numberOfRepayments = numberOfRepayments
        self.repaymentEvery = repaymentEvery
        self.repaymentFrequencyType = repaymentFrequencyType
        self.interestRatePerPeriod = interestRatePerPeriod
        self.amortizationType = amortizationType
        self.interestType = interestType
        self.interestCalculationPeriodType = interestCalculationPeriodType
        self.transactionProcessingStrategyId = transactionProcessingStrategyId
        self.expectedDisbursementDate = expectedDisbursementDate
        self.submittedOnDate = submittedOnDate
        self.linkAccountId = linkAccountId
        self.fixedEmiAmount = fixedEmiAmount
        self.maxOutstandingLoanBalance = maxOutstandingLoanBalance
        self.disbursementData = disbursementData
        self.datatables = datatables
    }


}

