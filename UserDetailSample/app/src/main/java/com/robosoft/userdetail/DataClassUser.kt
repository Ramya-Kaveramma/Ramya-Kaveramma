package com.robosoft.userdetail

import android.os.Parcel
import android.os.Parcelable

class DataClassUser() : Parcelable {
    var firstName: String? = null
    var middleName: String? = null
    var lastName: String? = null
    var gender: String? = null
    var age: String? = null
    var selectedGraduation: String? = null
    var mobileNum: String? = null
    var mailId: String? = null
    var selectedState: String? = null
    var marks: String? = null
    var relocate: String? = null
    var selectedYear: String? = null

    constructor(
        firstName: String,
        middleName: String,
        lastName: String,
        gender: String,
        age: String,
        selectedGraduation: String,
        mobileNum: String,
        mailId: String,
        selectedState: String,
        marks: String,
        relocate: String,
        selectedYear: String,
    ) : this() {
        this.firstName = firstName
        this.middleName = middleName
        this.lastName = lastName
        this.gender = gender
        this.age = age
        this.selectedGraduation = selectedGraduation
        this.mobileNum = mobileNum
        this.mailId = mailId
        this.selectedState = selectedState
        this.marks = marks
        this.relocate = relocate
        this.selectedYear = selectedYear
    }

    constructor(parcel: Parcel) : this() {
        firstName = parcel.readString()
        middleName = parcel.readString()
        lastName = parcel.readString()
        gender = parcel.readString()
        age = parcel.readString()
        selectedGraduation = parcel.readString()
        mobileNum = parcel.readString()
        mailId = parcel.readString()
        selectedState = parcel.readString()
        marks = parcel.readString()
        relocate = parcel.readString()
        selectedYear = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(firstName)
        parcel.writeString(middleName)
        parcel.writeString(lastName)
        parcel.writeString(gender)
        parcel.writeString(age)
        parcel.writeString(selectedGraduation)
        parcel.writeString(mobileNum)
        parcel.writeString(mailId)
        parcel.writeString(selectedState)
        parcel.writeString(marks)
        parcel.writeString(relocate)
        parcel.writeString(selectedYear)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataClassUser> {
        override fun createFromParcel(parcel: Parcel): DataClassUser {
            return DataClassUser(parcel)
        }

        override fun newArray(size: Int): Array<DataClassUser?> {
            return arrayOfNulls(size)
        }
    }
}