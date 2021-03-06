//
// PutDataTablesAppTableIdDatatableIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutDataTablesAppTableIdDatatableIdRequest: Codable {

    public var dateOfBirth: String?
    public var educationCdHighest: Int64?
    public var name: String?
    public var otherNotes: String?
    public var pointsScore: Int64?
    public var dateFormat: String?
    public var locale: String?

    public init(dateOfBirth: String?, educationCdHighest: Int64?, name: String?, otherNotes: String?, pointsScore: Int64?, dateFormat: String?, locale: String?) {
        self.dateOfBirth = dateOfBirth
        self.educationCdHighest = educationCdHighest
        self.name = name
        self.otherNotes = otherNotes
        self.pointsScore = pointsScore
        self.dateFormat = dateFormat
        self.locale = locale
    }

    public enum CodingKeys: String, CodingKey { 
        case dateOfBirth = "DateOfBirth"
        case educationCdHighest = "Education_cdHighest"
        case name = "Name"
        case otherNotes = "OtherNotes"
        case pointsScore = "PointsScore"
        case dateFormat
        case locale
    }


}

