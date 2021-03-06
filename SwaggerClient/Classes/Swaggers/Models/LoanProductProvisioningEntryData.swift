//
// LoanProductProvisioningEntryData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LoanProductProvisioningEntryData: Codable {

    public var historyId: Int64?
    public var officeId: Int64?
    public var currencyCode: String?
    public var productId: Int64?
    public var categoryId: Int64?
    public var overdueInDays: Int64?
    public var percentage: Double?
    public var liablityAccount: Int64?
    public var expenseAccount: Int64?
    public var criteriaId: Int64?
    public var outstandingBalance: Double?

    public init(historyId: Int64?, officeId: Int64?, currencyCode: String?, productId: Int64?, categoryId: Int64?, overdueInDays: Int64?, percentage: Double?, liablityAccount: Int64?, expenseAccount: Int64?, criteriaId: Int64?, outstandingBalance: Double?) {
        self.historyId = historyId
        self.officeId = officeId
        self.currencyCode = currencyCode
        self.productId = productId
        self.categoryId = categoryId
        self.overdueInDays = overdueInDays
        self.percentage = percentage
        self.liablityAccount = liablityAccount
        self.expenseAccount = expenseAccount
        self.criteriaId = criteriaId
        self.outstandingBalance = outstandingBalance
    }


}

