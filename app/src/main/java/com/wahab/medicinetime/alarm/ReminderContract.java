package com.wahab.medicinetime.alarm;

import com.wahab.medicinetime.BasePresenter;
import com.wahab.medicinetime.BaseView;
import com.wahab.medicinetime.data.source.History;
import com.wahab.medicinetime.data.source.MedicineAlarm;



public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
