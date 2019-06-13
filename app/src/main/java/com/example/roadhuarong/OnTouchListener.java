package com.example.roadhuarong;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;


public class OnTouchListener implements View.OnTouchListener {
    private static final float NULL = (float) -777;
    float start_x, start_y, end_x, end_y;
    int from, to;
    GridLayout mlayout;
    TextView score_text;
    MainActivity mActivity;

    OnTouchListener(MainActivity activity) {
        mActivity = activity;
        score_text = activity.findViewById(R.id.score_value);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getActionMasked();
        float margin = 50;
//        View caocao = mlayout.findViewById(R.id.caocao);
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                mlayout = (GridLayout) v.getParent();
                start_x = event.getX();
                start_y = event.getY();
                from = mlayout.indexOfChild(v);
                Log.d("position", Float.toString(from));
                return true;
            case MotionEvent.ACTION_UP:
                end_x = event.getX();
                end_y = event.getY();
//                to = get_view_position(v, end_x, end_y);
                if (end_x - start_x >= margin) {
                    Log.d("test oriantation", "Right");
//                    Log.d("edge test", Float.toString(v.getX()));
                    int id = v.getId();
                    switch (id) {
                        case (R.id.zhangfei5):
                            two_row_to_right(v);
                        case (R.id.caocao):
                            two_row_to_right(v);
                            break;
                        case (R.id.zhangfei1):
                            two_row_to_right(v);
                            break;
                        case (R.id.zhangfei2):
                            two_row_to_right(v);
                            break;
                        case (R.id.zhangfei3):
                            two_row_to_right(v);
                            break;
                        case (R.id.zhangfei4):
                            two_row_to_right(v);
                            break;
                        case (R.id.soldier1):
                            one_row_to_right(v);
                            break;
                        case (R.id.soldier2):
                            one_row_to_right(v);
                            break;
                        case (R.id.soldier3):
                            one_row_to_right(v);
                            break;
                        case (R.id.soldier4):
                            one_row_to_right(v);
                            break;
                        case (R.id.guanyu):
                            one_row_to_right(v);
                            break;
                        default:
                            break;
                    }
//                    if(!is_in_edge(from)){
//                        to = from + 1;// have edge bug
//                    }
//                    Log.d("let me see", view_params.rowSpec.toString());
                } else {
                    if (end_y - start_y >= margin) {
                        Log.d("test orientation", "down");
                        int id = v.getId();
                        switch (id) {
                            case (R.id.zhangfei5):
                                one_column_to_down(v);
                            case (R.id.caocao):
                                two_column_to_down(v);
                                break;
                            case (R.id.zhangfei1):
                                one_column_to_down(v);
                                break;
                            case (R.id.zhangfei2):
                                one_column_to_down(v);
                                break;
                            case (R.id.zhangfei3):
                                one_column_to_down(v);
                                break;
                            case (R.id.zhangfei4):
                                one_column_to_down(v);
                                break;
                            case (R.id.soldier1):
                                one_column_to_down(v);
                                break;
                            case (R.id.soldier2):
                                one_column_to_down(v);
                                break;
                            case (R.id.soldier3):
                                one_column_to_down(v);
                                break;
                            case (R.id.soldier4):
                                one_column_to_down(v);
                                break;
                            case (R.id.guanyu):
                                two_column_to_down(v);
                                break;
                            default:
                                break;
                        }

                    } else if (end_y - start_y <= -margin) {
                        Log.d("test orientation", "up");
                        int id = v.getId();
                        switch (id) {
                            case (R.id.zhangfei5):
                                one_column_to_up(v);
                            case (R.id.caocao):
                                two_column_to_up(v);
                                break;
                            case (R.id.zhangfei1):
                                one_column_to_up(v);
                                break;
                            case (R.id.zhangfei2):
                                one_column_to_up(v);
                                break;
                            case (R.id.zhangfei3):
                                one_column_to_up(v);
                                break;
                            case (R.id.zhangfei4):
                                one_column_to_up(v);
                                break;
                            case (R.id.soldier1):
                                one_column_to_up(v);
                                break;
                            case (R.id.soldier2):
                                one_column_to_up(v);
                                break;
                            case (R.id.soldier3):
                                one_column_to_up(v);
                                break;
                            case (R.id.soldier4):
                                one_column_to_up(v);
                                break;
                            case (R.id.guanyu):
                                two_column_to_up(v);
                                break;
                            default:
                                break;
                        }
                    } else if (start_x - end_x >= margin) {
                        Log.d("test orientation", "Left");
                        int id = v.getId();
                        switch (id) {
                            case (R.id.zhangfei5):
                                two_row_to_left(v);
                            case (R.id.caocao):
                                two_row_to_left(v);
                                break;
                            case (R.id.zhangfei1):
                                two_row_to_left(v);
                                break;
                            case (R.id.zhangfei2):
                                two_row_to_left(v);
                                break;
                            case (R.id.zhangfei3):
                                two_row_to_left(v);
                                break;
                            case (R.id.zhangfei4):
                                two_row_to_left(v);
                                break;
                            case (R.id.soldier1):
                                one_row_to_left(v);
                                break;
                            case (R.id.soldier2):
                                one_row_to_left(v);
                                break;
                            case (R.id.soldier3):
                                one_row_to_left(v);
                                break;
                            case (R.id.soldier4):
                                one_row_to_left(v);
                                break;
                            case (R.id.guanyu):
                                one_row_to_left(v);
                                break;
                            default:
                                break;
                        }
                    } else {
                        Log.d("taped", Float.toString(v.getX()));
                    }
                }
                return true;
            default:
                return false;
        }
    }

    void swap_view_horizantally(View v1, View v2) {
        int the_score = Integer.parseInt(score_text.getText().toString());
        if (from > to) {
            int tamp = from;
            from = to;
            to = tamp;
            View tampv = v1;
            v1 = v2;
            v2 = tampv;
        }
//        Log.d("test left right", Float.toString(v1.getRight()));
//        Log.d("test left right", Float.toString(v2.getLeft()));
        if (v1.getRight() == v2.getLeft()) {
            the_score++;
            String score = Integer.toString(the_score);
            score_text.setText(score);
            mlayout.removeView(v1);
            mlayout.removeView(v2);
            mlayout.addView(v2, from);
            mlayout.addView(v1, to);
            if (v1.getId() == R.id.caocao) {
                if (v1.getBottom() == mlayout.getBottom())
                    if (v1.getX() == (float) 0) {
                        Log.d("test end game", "congratulation");
                        SuccessDialog mdialog = new SuccessDialog();
                        mdialog.show(mActivity.getSupportFragmentManager(), "Success");
                    }
            }
            if (v2.getId() == R.id.caocao) {
                if (v2.getBottom() == mlayout.getBottom())
                    if (v2.getRight() == mlayout.getWidth()) {
                        Log.d("test end game", "congratulation");
                        SuccessDialog mdialog = new SuccessDialog();
                        mdialog.show(mActivity.getSupportFragmentManager(), "Success");
                    }
            }
        }

    }

    void swap_view_verticlly(View v1, View v2) {
        int the_score = Integer.parseInt(score_text.getText().toString());
        View v1_1 = null;
        View v2_1 = null;
        if (from > to) {
            int tamp = from;
            from = to;
            to = tamp;
            View tampv = v1;
            v1 = v2;
            v2 = tampv;
        }
        if (is_two_column(v2)) {
            v1_1 = mlayout.getChildAt(from + 1);
        } else if (is_two_column(v1)) {
            v2_1 = mlayout.getChildAt(to + 1);
        }
        if (is_two_row(v2)) {
            float the_y = NULL;
            for (int i = mlayout.indexOfChild(v2) + 1; i < mlayout.getChildCount(); i++) {//找下一层然后交换
                Log.d("test vertical the_y", Integer.toString(to));
                if (mlayout.getChildAt(i).getY() == v2.getY()) {
                    to++;
                    continue;
                } else {
//                    the_y = mlayout.getChildAt(i).getY();
                    the_y = v1.getBottom() + v1.getHeight();//层级判断有误
                    Log.d("test vertical the_y", Float.toString(the_y));
                }
                if (the_y != NULL) {
                    if (!is_same_level(the_y, mlayout.getChildAt(i).getY())&&!is_same_level(v1.getX(), mlayout.getChildAt(i).getX())) {
                        Log.d("test vertical y", Float.toString(mlayout.getChildAt(i).getY()));
                        to--;
//                        the_score++;
//                        String score = Integer.toString(the_score);
//                        score_text.setText(score);
//                        mlayout.removeView(v1);
//                        mlayout.removeView(v2);
//                        mlayout.addView(v2, from);
//                        mlayout.addView(v1, to);
//                        if (v1_1 != null) {
//                            mlayout.removeView(v1_1);
//                            mlayout.addView(v1_1, to);
//                        }
//                        if (v2_1 != null) {
//                            mlayout.removeView(v2_1);
//                            mlayout.addView(v2_1, from + 1);
//                        }
//                        return;
                    }
                }
//                if (mlayout.getChildAt(i).getY() == v2.getY()) {
//                    to++;
//                    continue;
//                } else {
//                    the_y = mlayout.getChildAt(i).getY();
//                }
                if(v1.getX() < mlayout.getChildAt(i).getX()){
                    to--;
                }
                if (is_same_level(v1.getX(), mlayout.getChildAt(i).getX())) {
                    the_score++;
                    String score = Integer.toString(the_score);
                    score_text.setText(score);
                    mlayout.removeView(v1);
                    mlayout.removeView(v2);
                    mlayout.addView(v2, from);
                    mlayout.addView(v1, to);
                    if (v1_1 != null) {
                        mlayout.removeView(v1_1);
                        mlayout.addView(v1_1, to);
                    }
                    if (v2_1 != null) {
                        mlayout.removeView(v2_1);
                        mlayout.addView(v2_1, from + 1);
                    }
                    return;
                }
                to++;
            }
        }
        if (is_two_row(v1)) {
            float the_y = NULL;
//            if(is_two_column(v1)){
//                to++;
//            }
            for (int i = mlayout.indexOfChild(v2) - 1; i >= 0; i--) {//找上一层然后交换
                Log.d("test vertical the_y", Integer.toString(to));
                if (mlayout.getChildAt(i).getY() == v2.getY()) {
                    to--;
                    continue;
                } else {
//                    the_y = mlayout.getChildAt(i).getY();
                    the_y = v1.getY() + v1.getHeight() / 2 - 1;//层级判断有误
                    Log.d("test vertical the_y", Float.toString(the_y));
                }
                if (the_y != NULL) {//第一层检查完，检查上一层，只需要检查到上一层
//                    if(is_two_column(v1)){
//                        to++;
//                    }
                    if (!is_same_level(the_y, mlayout.getChildAt(i).getY()) && i != from) {
                        Log.d("test vertical y", Float.toString(mlayout.getChildAt(i).getY()));
                        to++;
//                        mlayout.removeView(v1);
//                        mlayout.removeView(v2);
//                        mlayout.addView(v2, from);
//                        mlayout.addView(v1, to);
//                        if (v1_1 != null) {
//                            mlayout.removeView(v1_1);
//                            mlayout.addView(v1_1, to);
//                        }
//                        if (v2_1 != null) {
//                            mlayout.removeView(v2_1);
//                            mlayout.addView(v2_1, from + 1);
//                        }
//                        if (v1.getId() == R.id.caocao) {
//                            if (v1.getBottom() + mlayout.getHeight() / (float) 5 >= mlayout.getBottom()) {
//                                if (v1.getX() != 0 && v1.getRight() != mlayout.getWidth()) {
//                                    Log.d("test end game", "congratulation");
//                                    SuccessDialog mdialog = new SuccessDialog();
//                                    mdialog.show(mActivity.getSupportFragmentManager(), "Success");
//                                }
//                            }
//                        }
//                        return;
                    }
//                    } else {
//                        if (is_two_column(v1)) {
//                            to++;
//                        }
//                    }
                }
//                if (mlayout.getChildAt(i).getY() == v2.getY()) {
//                    to--;
//                    continue;
//                } else {
////                    the_y = mlayout.getChildAt(i).getY();
//                    the_y = v1.getY() + v1.getHeight()/2 - 1;//层级判断有误
//                    Log.d("test vertical the_y", Float.toString(the_y));
//                }
                if (v1.getX() > mlayout.getChildAt(i).getX()) {
                    to++;
                }
                if (is_same_level(v1.getX(), mlayout.getChildAt(i).getX())) {
                    the_score++;
                    String score = Integer.toString(the_score);
                    score_text.setText(score);
                    mlayout.removeView(v1);
                    mlayout.removeView(v2);
                    mlayout.addView(v2, from);
                    mlayout.addView(v1, to);
                    if (v1_1 != null) {
                        mlayout.removeView(v1_1);
                        mlayout.addView(v1_1, to);
                    }
                    if (v2_1 != null) {
                        mlayout.removeView(v2_1);
                        mlayout.addView(v2_1, from + 1);
                    }
                    if (v1.getId() == R.id.caocao) {
                        if (v1.getBottom() + mlayout.getHeight() / (float) 5 >= mlayout.getBottom()) {
                            if (v1.getX() != 0 && v1.getRight() != mlayout.getWidth()) {
                                Log.d("test end game", "congratulation");
                                SuccessDialog mdialog = new SuccessDialog();
                                mdialog.show(mActivity.getSupportFragmentManager(), "Success");
                            }
                        }
                    }
                    return;
                }
                to--;
            }
        }
        the_score++;
        String score = Integer.toString(the_score);
        score_text.setText(score);
        mlayout.removeView(v1);
        mlayout.removeView(v2);
        mlayout.addView(v2, from);
        mlayout.addView(v1, to);
        if (v1_1 != null) {
            mlayout.removeView(v1_1);
            mlayout.addView(v1_1, to);
        }
        if (v2_1 != null) {
            mlayout.removeView(v2_1);
            mlayout.addView(v2_1, from + 1);
        }
        if (v1.getId() == R.id.caocao) {
            if (v1.getBottom() + mlayout.getHeight() / (float) 5 >= mlayout.getBottom()) {
                if (v1.getX() != 0 && v1.getRight() != mlayout.getWidth()) {
                    Log.d("test end game", "congratulation");
                    SuccessDialog mdialog = new SuccessDialog();
                    mdialog.show(mActivity.getSupportFragmentManager(), "Success");
                }
            }
        }
    }

    boolean is_all_white(View t1, View t2) {
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.getId() == R.id.white1 || t1.getId() == R.id.white2) {
            if (t2.getId() == R.id.white1 || t2.getId() == R.id.white2) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    void two_row_to_right(View v) {//有BUG 无法判断位置
        float width = mlayout.getWidth() / (float) mlayout.getColumnCount();
        if (v.getX() + v.getWidth() >= mlayout.getWidth()) {//边界
            Log.d("edge", "是边界");
            return;
        }
        for (int i = from + 1; i < mlayout.getChildCount(); i++) {
            if (is_same_level(v.getRight(), mlayout.getChildAt(i).getX())) {
                to = i;
                break;
            }
        }
        View target1 = mlayout.getChildAt(to);
        View target2 = find_down(target1);
        if (target2 == null) {
            target2 = find_up(target1);
        }
        if (is_all_white(target1, target2)) {
            swap_view_horizantally(v, target1);
        }
    }

    void one_row_to_right(View v) {
        float width = mlayout.getWidth() / (float) mlayout.getColumnCount();
        if (v.getX() + v.getWidth() >= mlayout.getWidth()) {//边界
            Log.d("edge", "是边界");
            return;
        }
        for (int i = from + 1; i < mlayout.getChildCount(); i++) {
            if (is_same_level(v.getRight(), mlayout.getChildAt(i).getX()) && is_same_level(v.getBottom(), mlayout.getChildAt(i).getBottom())) {
                to = i;
                break;
            }
        }
        if (mlayout.getChildAt(to).getId() == R.id.white1 || mlayout.getChildAt(to).getId() == R.id.white2) {
            swap_view_horizantally(v, mlayout.getChildAt(to));
        }
    }

    void two_row_to_left(View v) {//有BUG 无法判断位置
        float width = mlayout.getWidth() / (float) mlayout.getColumnCount();
        if (v.getX() <= 0.1) {//边界
            Log.d("edge", "是边界");
            return;
        }
        for (int i = from - 1; i >= 0; i--) {
            if (is_same_level(mlayout.getChildAt(i).getRight(), v.getX())) {
                to = i;
                break;
            }
        }
        View target1 = mlayout.getChildAt(to);
        View target2 = find_down(target1);
        if (target2 == null) {
            target2 = find_up(target1);
        }
        if (is_all_white(target1, target2)) {
            swap_view_horizantally(v, target1);
        }
    }

    void one_row_to_left(View v) {
        float width = mlayout.getWidth() / (float) mlayout.getColumnCount();
        if (v.getX() <= 0.1) {//边界
            Log.d("edge", "是边界");
            return;
        }
        for (int i = from - 1; i >= 0; i--) {
            if (is_same_level(mlayout.getChildAt(i).getRight(), v.getX()) && is_same_level(v.getBottom(), mlayout.getChildAt(i).getBottom())) {
                to = i;
                break;
            }
        }
        if (mlayout.getChildAt(to).getId() == R.id.white1 || mlayout.getChildAt(to).getId() == R.id.white2) {
            swap_view_horizantally(v, mlayout.getChildAt(to));
        }
    }

    void two_column_to_down(View v) {
        float height = mlayout.getHeight() / (float) mlayout.getRowCount();
        if (v.getY() + v.getHeight() >= mlayout.getHeight()) {//边界
            Log.d("edge", "是边界");
            return;
        }
        View targit1 = find_down(v);
        View targit2 = mlayout.getChildAt(mlayout.indexOfChild(targit1) + 1);
        if (is_all_white(targit1, targit2)) {
            to = mlayout.indexOfChild(targit1);
            swap_view_verticlly(v, targit1);
        }
    }

    void one_column_to_down(View v) {
        float height = mlayout.getHeight() / (float) mlayout.getRowCount();
//        Log.d("width", Float.toString(height * 4));
        if (v.getY() + v.getHeight() >= mlayout.getHeight()) {//边界
            Log.d("edge", "是边界");
            return;
        }
        View targit = find_down(v);
        if (targit == null) {
            return;
        }
        if (targit.getId() == R.id.white1 || targit.getId() == R.id.white2) {
            to = mlayout.indexOfChild(targit);
            swap_view_verticlly(v, targit);
        }
    }

    void two_column_to_up(View v) {
        float height = mlayout.getHeight() / (float) mlayout.getRowCount();
        if (v.getY() <= 0.1) {//边界
            Log.d("edge", "是边界");
            return;
        }
        View targit1 = find_up(v);
        View targit2 = mlayout.getChildAt(mlayout.indexOfChild(targit1) + 1);

        if (is_all_white(targit1, targit2)) {
            to = mlayout.indexOfChild(targit1);
            swap_view_verticlly(v, targit1);
        }
    }

    void one_column_to_up(View v) {
        float height = mlayout.getHeight() / (float) mlayout.getRowCount();
//        Log.d("width", Float.toString(height * 4));
        if (v.getY() <= 0.1) {//边界
            Log.d("edge", "是边界");
            return;
        }
        View targit = find_up(v);
        if (targit == null) {
            return;
        }
//        Log.d("find up test", Integer.toString(mlayout.indexOfChild(targit)));
        if (targit.getId() == R.id.white1 || targit.getId() == R.id.white2) {
            to = mlayout.indexOfChild(targit);
            swap_view_verticlly(v, targit);
        }
    }

    View find_down(View v) {
        float position_x = v.getX();
        for (int i = mlayout.indexOfChild(v) + 1; i < mlayout.getChildCount(); i++) {
            if (position_x == mlayout.getChildAt(i).getX()) {
                return mlayout.getChildAt(i);
            }
        }
        return null;
    }

    View find_up(View v) {
        float positiin_x = v.getX();
        for (int i = mlayout.indexOfChild(v) - 1; i >= 0; i--) {
            if (positiin_x == mlayout.getChildAt(i).getX()) {
                return mlayout.getChildAt(i);
            }
        }
        return null;
    }

    boolean is_same_level(float y1, float y2) {
        if (y1 < y2) {
            float tamp = y1;
            y1 = y2;
            y2 = tamp;
        }
//        if(y1 - y2 <= (float)50){
//            return true;
//        } else {
//            return false;
//        }
        return y1 - y2 <= (float) 50;
    }

    boolean is_two_column(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.soldier1:
                return false;
            case R.id.soldier2:
                return false;
            case R.id.soldier3:
                return false;
            case R.id.soldier4:
                return false;
            case R.id.caocao:
                return true;
            case R.id.zhangfei1:
                return false;
            case R.id.zhangfei2:
                return false;
            case R.id.zhangfei3:
                return false;
            case R.id.zhangfei4:
                return false;
            case R.id.zhangfei5:
                return false;
            case R.id.guanyu:
                return true;
            default:
                return false;
        }
    }

    boolean is_two_row(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.soldier1:
                return false;
            case R.id.soldier2:
                return false;
            case R.id.soldier3:
                return false;
            case R.id.soldier4:
                return false;
            case R.id.caocao:
                return true;
            case R.id.zhangfei1:
                return true;
            case R.id.zhangfei2:
                return true;
            case R.id.zhangfei3:
                return true;
            case R.id.zhangfei4:
                return true;
            case R.id.zhangfei5:
                return true;
            case R.id.guanyu:
                return false;
            default:
                return false;
        }
    }
}
