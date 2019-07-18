//
// PostAdhocQuerySearchRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostAdhocQuerySearchRequest: Codable {

    public var locale: String?
    public var dateFormat: String?
    public var loanDateOption: String?
    public var loanFromDate: Date?
    public var loanToDate: Date?
    public var includeOutStandingAmountPercentage: Bool?
    public var outStandingAmountPercentageCondition: String?
    public var outStandingAmountPercentage: Int64?
    public var includeOutstandingAmount: Bool?
    public var outstandingAmountCondition: String?
    public var minOutstandingAmount: Int64?
    public var maxOutstandingAmount: Int64?

    public init(locale: String?, dateFormat: String?, loanDateOption: String?, loanFromDate: Date?, loanToDate: Date?, includeOutStandingAmountPercentage: Bool?, outStandingAmountPercentageCondition: String?, outStandingAmountPercentage: Int64?, includeOutstandingAmount: Bool?, outstandingAmountCondition: String?, minOutstandingAmount: Int64?, maxOutstandingAmount: Int64?) {
        self.locale = locale
        self.dateFormat = dateFormat
        self.loanDateOption = loanDateOption
        self.loanFromDate = loanFromDate
        self.loanToDate = loanToDate
        self.includeOutStandingAmountPercentage = includeOutStandingAmountPercentage
        self.outStandingAmountPercentageCondition = outStandingAmountPercentageCondition
        self.outStandingAmountPercentage = outStandingAmountPercentage
        self.includeOutstandingAmount = includeOutstandingAmount
        self.outstandingAmountCondition = outstandingAmountCondition
        self.minOutstandingAmount = minOutstandingAmount
        self.maxOutstandingAmount = maxOutstandingAmount
    }


}

