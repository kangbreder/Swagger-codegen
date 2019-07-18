//
// GLAccount.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GLAccount: Codable {

    public var _id: Int64?
    public var children: [GLAccount]?
    public var name: String?
    public var glCode: String?
    public var disabled: Bool?
    public var manualEntriesAllowed: Bool?
    public var type: Int?
    public var usage: Int?
    public var headerAccount: Bool?
    public var detailAccount: Bool?
    public var new: Bool?

    public init(_id: Int64?, children: [GLAccount]?, name: String?, glCode: String?, disabled: Bool?, manualEntriesAllowed: Bool?, type: Int?, usage: Int?, headerAccount: Bool?, detailAccount: Bool?, new: Bool?) {
        self._id = _id
        self.children = children
        self.name = name
        self.glCode = glCode
        self.disabled = disabled
        self.manualEntriesAllowed = manualEntriesAllowed
        self.type = type
        self.usage = usage
        self.headerAccount = headerAccount
        self.detailAccount = detailAccount
        self.new = new
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case children
        case name
        case glCode
        case disabled
        case manualEntriesAllowed
        case type
        case usage
        case headerAccount
        case detailAccount
        case new
    }


}
