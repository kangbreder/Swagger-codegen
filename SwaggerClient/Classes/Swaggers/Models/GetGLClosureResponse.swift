//
// GetGLClosureResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGLClosureResponse: Codable {

    public var _id: Int64?
    public var officeId: Int64?
    public var officeName: String?
    public var closingDate: Date?
    public var deleted: Bool?
    public var createdDate: Date?
    public var lastUpdatedDate: Date?
    public var createdByUserId: Int64?
    public var createdByUsername: String?
    public var lastUpdatedByUserId: Int64?
    public var lastUpdatedByUsername: String?
    public var comments: String?

    public init(_id: Int64?, officeId: Int64?, officeName: String?, closingDate: Date?, deleted: Bool?, createdDate: Date?, lastUpdatedDate: Date?, createdByUserId: Int64?, createdByUsername: String?, lastUpdatedByUserId: Int64?, lastUpdatedByUsername: String?, comments: String?) {
        self._id = _id
        self.officeId = officeId
        self.officeName = officeName
        self.closingDate = closingDate
        self.deleted = deleted
        self.createdDate = createdDate
        self.lastUpdatedDate = lastUpdatedDate
        self.createdByUserId = createdByUserId
        self.createdByUsername = createdByUsername
        self.lastUpdatedByUserId = lastUpdatedByUserId
        self.lastUpdatedByUsername = lastUpdatedByUsername
        self.comments = comments
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case officeId
        case officeName
        case closingDate
        case deleted
        case createdDate
        case lastUpdatedDate
        case createdByUserId
        case createdByUsername
        case lastUpdatedByUserId
        case lastUpdatedByUsername
        case comments
    }


}
