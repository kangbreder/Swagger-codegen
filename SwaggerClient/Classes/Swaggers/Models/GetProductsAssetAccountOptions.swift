//
// GetProductsAssetAccountOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetProductsAssetAccountOptions: Codable {

    public var _id: Int?
    public var name: String?
    public var glCode: String?
    public var disabled: Bool?
    public var manualEntriesAllowed: Bool?
    public var type: GetAssetType?
    public var usage: GetProductsLiabilityUsage?
    public var _description: String?
    public var nameDecorated: String?
    public var tagId: GetProductsTagId?

    public init(_id: Int?, name: String?, glCode: String?, disabled: Bool?, manualEntriesAllowed: Bool?, type: GetAssetType?, usage: GetProductsLiabilityUsage?, _description: String?, nameDecorated: String?, tagId: GetProductsTagId?) {
        self._id = _id
        self.name = name
        self.glCode = glCode
        self.disabled = disabled
        self.manualEntriesAllowed = manualEntriesAllowed
        self.type = type
        self.usage = usage
        self._description = _description
        self.nameDecorated = nameDecorated
        self.tagId = tagId
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case glCode
        case disabled
        case manualEntriesAllowed
        case type
        case usage
        case _description = "description"
        case nameDecorated
        case tagId
    }


}

