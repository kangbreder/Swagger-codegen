//
// GetLoansLoanIdSummary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoansLoanIdSummary: Codable {

    public var currency: GetLoansLoanIdCurrency?
    public var principalDisbursed: Int64?
    public var principalPaid: Int64?
    public var principalWrittenOff: Int64?
    public var principalOutstanding: Int64?
    public var principalOverdue: Double?
    public var interestCharged: Int64?
    public var interestPaid: Int64?
    public var interestWaived: Int64?
    public var interestWrittenOff: Int64?
    public var interestOutstanding: Int64?
    public var interestOverdue: Int64?
    public var feeChargesCharged: Int64?
    public var feeChargesDueAtDisbursementCharged: Int64?
    public var feeChargesPaid: Int64?
    public var feeChargesWaived: Int64?
    public var feeChargesWrittenOff: Int64?
    public var feeChargesOutstanding: Int64?
    public var feeChargesOverdue: Int64?
    public var penaltyChargesCharged: Int64?
    public var penaltyChargesPaid: Int64?
    public var penaltyChargesWaived: Int64?
    public var penaltyChargesWrittenOff: Int64?
    public var penaltyChargesOutstanding: Int64?
    public var penaltyChargesOverdue: Int64?
    public var totalExpectedRepayment: Int64?
    public var totalRepayment: Int64?
    public var totalExpectedCostOfLoan: Int64?
    public var totalCostOfLoan: Int64?
    public var totalWaived: Int64?
    public var totalWrittenOff: Int64?
    public var totalOutstanding: Int64?
    public var totalOverdue: Double?
    public var overdueSinceDate: Date?
    public var linkedAccount: GetLoansLoanIdLinkedAccount?
    public var disbursementDetails: [GetLoansLoanIdDisbursementDetails]?
    public var fixedEmiAmount: Float?
    public var maxOutstandingLoanBalance: Int64?
    public var canDisburse: Bool?
    public var emiAmountVariations: [GetLoansLoanIdEmiVariations]?
    public var inArrears: Bool?
    public var isNPA: Bool?
    public var overdueCharges: [GetLoansLoanIdOverdueCharges]?

    public init(currency: GetLoansLoanIdCurrency?, principalDisbursed: Int64?, principalPaid: Int64?, principalWrittenOff: Int64?, principalOutstanding: Int64?, principalOverdue: Double?, interestCharged: Int64?, interestPaid: Int64?, interestWaived: Int64?, interestWrittenOff: Int64?, interestOutstanding: Int64?, interestOverdue: Int64?, feeChargesCharged: Int64?, feeChargesDueAtDisbursementCharged: Int64?, feeChargesPaid: Int64?, feeChargesWaived: Int64?, feeChargesWrittenOff: Int64?, feeChargesOutstanding: Int64?, feeChargesOverdue: Int64?, penaltyChargesCharged: Int64?, penaltyChargesPaid: Int64?, penaltyChargesWaived: Int64?, penaltyChargesWrittenOff: Int64?, penaltyChargesOutstanding: Int64?, penaltyChargesOverdue: Int64?, totalExpectedRepayment: Int64?, totalRepayment: Int64?, totalExpectedCostOfLoan: Int64?, totalCostOfLoan: Int64?, totalWaived: Int64?, totalWrittenOff: Int64?, totalOutstanding: Int64?, totalOverdue: Double?, overdueSinceDate: Date?, linkedAccount: GetLoansLoanIdLinkedAccount?, disbursementDetails: [GetLoansLoanIdDisbursementDetails]?, fixedEmiAmount: Float?, maxOutstandingLoanBalance: Int64?, canDisburse: Bool?, emiAmountVariations: [GetLoansLoanIdEmiVariations]?, inArrears: Bool?, isNPA: Bool?, overdueCharges: [GetLoansLoanIdOverdueCharges]?) {
        self.currency = currency
        self.principalDisbursed = principalDisbursed
        self.principalPaid = principalPaid
        self.principalWrittenOff = principalWrittenOff
        self.principalOutstanding = principalOutstanding
        self.principalOverdue = principalOverdue
        self.interestCharged = interestCharged
        self.interestPaid = interestPaid
        self.interestWaived = interestWaived
        self.interestWrittenOff = interestWrittenOff
        self.interestOutstanding = interestOutstanding
        self.interestOverdue = interestOverdue
        self.feeChargesCharged = feeChargesCharged
        self.feeChargesDueAtDisbursementCharged = feeChargesDueAtDisbursementCharged
        self.feeChargesPaid = feeChargesPaid
        self.feeChargesWaived = feeChargesWaived
        self.feeChargesWrittenOff = feeChargesWrittenOff
        self.feeChargesOutstanding = feeChargesOutstanding
        self.feeChargesOverdue = feeChargesOverdue
        self.penaltyChargesCharged = penaltyChargesCharged
        self.penaltyChargesPaid = penaltyChargesPaid
        self.penaltyChargesWaived = penaltyChargesWaived
        self.penaltyChargesWrittenOff = penaltyChargesWrittenOff
        self.penaltyChargesOutstanding = penaltyChargesOutstanding
        self.penaltyChargesOverdue = penaltyChargesOverdue
        self.totalExpectedRepayment = totalExpectedRepayment
        self.totalRepayment = totalRepayment
        self.totalExpectedCostOfLoan = totalExpectedCostOfLoan
        self.totalCostOfLoan = totalCostOfLoan
        self.totalWaived = totalWaived
        self.totalWrittenOff = totalWrittenOff
        self.totalOutstanding = totalOutstanding
        self.totalOverdue = totalOverdue
        self.overdueSinceDate = overdueSinceDate
        self.linkedAccount = linkedAccount
        self.disbursementDetails = disbursementDetails
        self.fixedEmiAmount = fixedEmiAmount
        self.maxOutstandingLoanBalance = maxOutstandingLoanBalance
        self.canDisburse = canDisburse
        self.emiAmountVariations = emiAmountVariations
        self.inArrears = inArrears
        self.isNPA = isNPA
        self.overdueCharges = overdueCharges
    }


}

