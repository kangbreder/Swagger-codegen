//
// GetAccountRulesResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountRulesResponse: Codable {

    public var _id: Int64?
    public var officeId: Int64?
    public var officeName: String?
    public var name: String?
    public var _description: String?
    public var systemDefined: Bool?
    public var allowMultipleDebitEntries: Bool?
    public var allowMultipleCreditEntries: Bool?
    public var creditTags: [AccountingTagRuleData]?
    public var debitTags: [AccountingTagRuleData]?

    public init(_id: Int64?, officeId: Int64?, officeName: String?, name: String?, _description: String?, systemDefined: Bool?, allowMultipleDebitEntries: Bool?, allowMultipleCreditEntries: Bool?, creditTags: [AccountingTagRuleData]?, debitTags: [AccountingTagRuleData]?) {
        self._id = _id
        self.officeId = officeId
        self.officeName = officeName
        self.name = name
        self._description = _description
        self.systemDefined = systemDefined
        self.allowMultipleDebitEntries = allowMultipleDebitEntries
        self.allowMultipleCreditEntries = allowMultipleCreditEntries
        self.creditTags = creditTags
        self.debitTags = debitTags
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case officeId
        case officeName
        case name
        case _description = "description"
        case systemDefined
        case allowMultipleDebitEntries
        case allowMultipleCreditEntries
        case creditTags
        case debitTags
    }


}

