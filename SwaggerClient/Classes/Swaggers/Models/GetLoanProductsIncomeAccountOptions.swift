//
// GetLoanProductsIncomeAccountOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoanProductsIncomeAccountOptions: Codable {

    public var _id: Int?
    public var name: String?
    public var glCode: Int?
    public var disabled: Bool?
    public var manualEntriesAllowed: Bool?
    public var type: GetLoanProductsIncomeType?
    public var usage: GetLoanProductsLiabilityUsage?
    public var nameDecorated: String?
    public var tagId: GetLoanProductsLiabilityTagId?
    public var organizationRunningBalance: Int?

    public init(_id: Int?, name: String?, glCode: Int?, disabled: Bool?, manualEntriesAllowed: Bool?, type: GetLoanProductsIncomeType?, usage: GetLoanProductsLiabilityUsage?, nameDecorated: String?, tagId: GetLoanProductsLiabilityTagId?, organizationRunningBalance: Int?) {
        self._id = _id
        self.name = name
        self.glCode = glCode
        self.disabled = disabled
        self.manualEntriesAllowed = manualEntriesAllowed
        self.type = type
        self.usage = usage
        self.nameDecorated = nameDecorated
        self.tagId = tagId
        self.organizationRunningBalance = organizationRunningBalance
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case glCode
        case disabled
        case manualEntriesAllowed
        case type
        case usage
        case nameDecorated
        case tagId
        case organizationRunningBalance
    }


}

